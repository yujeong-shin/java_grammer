package Spring;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) {
        //db의 url : localhost:3306
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String pw = "1234";

        try {
            //MySQL, mariaDB, .. 어떤 DB인지 알 수 없기 떄문에 드라이버가 필요하다.
            //우리가 설정한 요청은 http이고, mariaDB는 https.
            //SSL(secure) 정보가 달라 useSSL=false 추가해준다.
            Connection conn = DriverManager.getConnection(url, userName, pw);
            System.out.println("DB 커넥션 성공");
            //statement : 쿼리를 담아 db로 보낼 수 있는 객체
            Statement st = conn.createStatement();
            String myQuery = "select * from author";
            ResultSet rs = st.executeQuery(myQuery);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id = " + id + "name = " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}