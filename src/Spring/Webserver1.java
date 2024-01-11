package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//간단한 8080 웹서버 생성
public class Webserver1 {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
            while(true){
                //사용자에게 response 전달
                try ( Socket socket = serverSocket.accept()){
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World";
                    socket.getOutputStream().write(httpRes.getBytes(StandardCharsets.UTF_8));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
