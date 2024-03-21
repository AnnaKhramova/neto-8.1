package handler;

public class Request {
    String method;
    String path;

    public Request(String method, String path) {
        this.method = method;
        this.path = path;
    }
}
