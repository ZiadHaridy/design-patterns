# 03 - Configuration Manager

## The Problem (Bad Version)

Each module creates its own `ConfigurationManager`:

```java
ConfigurationManager configA = new ConfigurationManager();
ConfigurationManager configB = new ConfigurationManager();
```

When Module A changes `log.level` to `"DEBUG"`, Module B still sees `"INFO"` because it has its **own copy** of the config. This causes **inconsistent behavior** across the application.

## The Fix (Good Version)

With Singleton, there is **one** config object:

```java
ConfigurationManager config = ConfigurationManager.getInstance();
```

When any module calls `set("log.level", "DEBUG")`, every other module that calls `get("log.level")` immediately sees `"DEBUG"`.

## Key Takeaway

Configuration should be a **single source of truth**. The Singleton pattern prevents config drift between modules by ensuring all parts of the application read from and write to the same instance.
