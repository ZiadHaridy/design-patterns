# 04 - File Compressor

## The Problem (Bad Version)

The compression format is a constructor string, and all logic lives in `if/else`:

```java
new FileCompressor("ZIP").compress("file.pdf");
```

Adding BZIP2 = modifying `FileCompressor`. The class can never be "closed for modification."

## The Fix (Good Version)

Each format is a strategy class:

```java
FileCompressor compressor = new FileCompressor(new ZipCompression());
compressor.compress("file.pdf");

compressor.setStrategy(new GzipCompression()); // switch at runtime
compressor.compress("data.csv");
```

`FileCompressor` has no `if/else`, no format strings — just one call to `strategy.compress(filename)`.

## Key Takeaway

This is identical in structure to how real-world libraries work. Java's `java.util.zip`, for example, uses interchangeable compressors behind a common interface. Strategy is the backbone of pluggable algorithm systems.
