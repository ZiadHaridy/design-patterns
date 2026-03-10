# 03 - Data Stream

## The Problem (Bad Version)

Each combination of data processing needs its own class:
- `EncryptedFileWriter`
- `CompressedFileWriter`
- `EncryptedCompressedFileWriter`

The **order** of processing is hardcoded. You can't change it at runtime.

## The Fix (Good Version)

Each processing step is a decorator. The order of wrapping determines the processing pipeline:

```java
// Compress first, then encrypt
DataStream stream = new EncryptionDecorator(
                        new CompressionDecorator(new FileDataStream()));
stream.write("data");
// → Compressing... → Encrypting... → Writing: ENC(ZIP(data))

// Encrypt first, then compress (just swap the order!)
DataStream stream2 = new CompressionDecorator(
                         new EncryptionDecorator(new FileDataStream()));
stream2.write("data");
// → Encrypting... → Compressing... → Writing: ZIP(ENC(data))
```

## Key Takeaway

This is how Java's `java.io` streams work! `BufferedReader(InputStreamReader(FileInputStream))` is the Decorator pattern in action. Each layer adds one processing step, and you choose the pipeline at runtime.
