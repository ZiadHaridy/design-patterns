# 02 - Authentication Pipeline

## The Problem (Bad Version)

All authentication checks are sequential `if` blocks in one method:

```java
if (!users.containsKey(username)) return false;   // check 1
if (!users.get(username).equals(password)) return false;  // check 2
if (!hasRole(username, requiredRole)) return false;  // check 3
// check 4...
```

This is a **validation pipeline** masquerading as a single method. Adding 2FA, IP blocking, or CAPTCHA means editing this method every time.

## The Fix (Good Version)

Each check becomes a handler in a chain:

```java
userExists.setNext(password).setNext(role).setNext(rateLimit);
userExists.handle(request);
```

If any handler fails → the chain stops and returns `false`.
If all pass → the chain completes and returns `true`.

## Key Takeaway

Chain of Responsibility is the pattern behind **middleware pipelines** in frameworks like Spring Security, Express.js, and Django. Each handler is a focused, testable unit that can be added, removed, or reordered without touching others.
