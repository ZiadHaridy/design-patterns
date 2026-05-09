# 02 - Organization Hierarchy

## The Problem (Bad Version)

`Employee` and `Manager` are independent classes. Walking the org chart means recursive `instanceof` checks:

```java
if (person instanceof Manager) {
    for (Object r : m.reports) totalSalary(r);
}
```

Adding `Contractor` or `Team` requires editing every operation.

## The Fix (Good Version)

`OrgUnit` is the common abstraction. `Employee` (leaf) and `Manager` (composite) both implement it.

```java
ceo.totalSalary();    // recurses through the org
eng.totalSalary();    // works on any subtree
```

A whole subtree behaves the same way as a single employee.

## Key Takeaway

Composite is a natural fit for any tree where leaves and groups need to support the same operations. Reporting on the whole company or one department uses the same call.
