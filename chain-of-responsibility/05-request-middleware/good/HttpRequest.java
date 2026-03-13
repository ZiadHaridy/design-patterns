/**
 * Request object — carries HTTP request data through the middleware chain.
 */
public class HttpRequest {

    private String path;
    private String token;
    private String ip;

    public HttpRequest(String path, String token, String ip) {
        this.path = path;
        this.token = token;
        this.ip = ip;
    }

    public String getPath() { return path; }
    public String getToken() { return token; }
    public String getIp() { return ip; }

    @Override
    public String toString() {
        return "Request{" + ip + " -> " + path + "}";
    }
}
