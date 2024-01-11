package Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Webserver3 {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");

            //사용자의 요청 Request - Header와 Body는 개행 문자로 구분돼서 들어온다.
            //POST / HTTP/1.1
            //Host: localhost:8081
            //Content-Type: application/x-www-form-urlencoded
            //Content-Length: xx
            //
            //userInput=helloWorld
            while(true){
                //사용자에게 response 전달
                try ( Socket socket = serverSocket.accept()){ //socket : 사용자 request가 담겨 있는 객체
                    //br에 header와 body 정보 모두 들어가 있음
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line = "";
                    // readLine : 한 줄로 구분하여 header만 읽기
                    while (!(line = br.readLine()).isBlank()){
                        sb.append(line+"\n");
                        //개행문자가 두 줄 나오면 while문 종료하기 때문에 header까지만 sb에 담김
                    }
                    if(sb.toString().contains("POST")){
                        //사용자가 보내온 requpest의 body를 꺼내옴
                        char[] buffer = new char[1024];
                        br.read(buffer); //br에 담긴 값 : body
                        System.out.println("POST body data : " + new String(buffer));
                        System.out.println("POST header data : " + sb.toString());
                    }
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "ok";
                    socket.getOutputStream().write(httpRes.getBytes(StandardCharsets.UTF_8));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
