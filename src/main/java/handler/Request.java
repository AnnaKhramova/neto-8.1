package handler;

public class Request {
    String method;
    String headers;
    String body;

    public Request(String method, String headers, String body) {
        this.method = method;
        this.headers = headers;
        this.body = body;
    }
}
