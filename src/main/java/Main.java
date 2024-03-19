import handler.Handler;
import handler.Request;

import java.io.BufferedOutputStream;

public class Main {
    public static void main(String[] args){
        final var server = new Server();
        // ��� ������������� ������� (�� ������ ����������� ��)

        // ���������� ��������� (������������)
        server.addHandler("GET", "/messages", new Handler() {
            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });
        server.addHandler("POST", "/messages", new Handler() {
            public void handle(Request request, BufferedOutputStream responseStream) {
                // TODO: handlers code
            }
        });

        server.start(9999);
    }
}