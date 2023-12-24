package ws;

import jakarta.xml.ws.Endpoint;

public class WebServer {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8989/";
        Endpoint.publish(url, new BanqueApp());
        System.out.println("JaxWS server is running using the address: " + url);
    }
}
