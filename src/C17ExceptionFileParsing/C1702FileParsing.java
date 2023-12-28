package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C1702FileParsing {
    public static void main(String[] args) {
//        src\C17ExceptionFileParsing
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text.txt");

//        버퍼 기능이 구현되어 있고, NIO 패키지에서는 non-blocking 방식 사용
//        File은 java.io
//        Files는 java.nio.file
//        기본이StandardCharsets.UTF_8
//        CREATE_NEW 이후에 APPEND 실행 가능.
        try {
            if(Files.exists(filePath)){
                //파일이 있으면
                //Append는 추가하기, Write는 덮어쓰기
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            }else{ //파일이 없으면 생성
                Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//        파일읽기 : readString, readAllLines(List형태)
//        readString
        try {
            String mySt = Files.readString(filePath);
//            mtSt = 손흥민\n손흥민\n손흥민\n손흥민\n; 나중에 자르기 쉽지 않음
            System.out.println(mySt);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        readAllLines
        try {
            List<String> myStList = Files.readAllLines(filePath);
//            myStList = 개행문자 기준으로 잘라 나중에 사용하기 쉬움
            for(String a : myStList){
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
