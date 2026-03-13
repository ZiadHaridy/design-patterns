# 05 - Request Middleware

## The Problem (Bad Version)

All middleware concerns are tangled in one method:

```java
public void process(String path, String token, String ip) {
    // logging
    // rate limiting
    // authentication
    // actual handler
}
```

- Can't add CORS without editing `process()`
- Can't disable rate-limiting without commenting code
- Can't reuse the auth logic in another service

## The Fix (Good Version)

Each middleware concern is a handler:

```java
logging.setNext(rateLimit).setNext(auth);
logging.handle(new HttpRequest("/api/users", "valid-token-123", "10.0.0.1"));
```

The chain is **configured by the client**, not hardcoded:
- Want to skip logging? Don't add it to the chain
- Want to add CORS? Create `CorsMiddleware` and link it in
- Want a different order? Just change the `setNext()` calls

## Key Takeaway

This is exactly how **Express.js middleware**, **Spring Interceptors**, and **Servlet Filters** work. Each middleware is an independent handler that either passes the request forward or short-circuits it. Chain of Responsibility is the backbone of modern web frameworks.
