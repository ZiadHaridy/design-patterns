# 02 - Database Driver

## The Problem (Bad Version)

`DataAccess.runReport(vendor)` asks the same vendor question at every step (open, query, close) and inlines vendor-specific SQL syntax. Worst of all, nothing prevents a code path that opens a MySQL connection and runs a Postgres-flavored command.

## The Fix (Good Version)

Two product interfaces (`Connection`, `Command`) and a `DbFactory` that produces both. `MySqlFactory` and `PostgresFactory` only ever return their own family.

```java
new DataAccess(new MySqlFactory()).runReport();
new DataAccess(new PostgresFactory()).runReport();
```

The compiler now guarantees that the connection and command in any single `DataAccess` come from the same vendor.

## Key Takeaway

Abstract Factory shines whenever products are **interchangeable as a set** but **must not be mixed**. The whole driver is swapped together — never piece by piece.
