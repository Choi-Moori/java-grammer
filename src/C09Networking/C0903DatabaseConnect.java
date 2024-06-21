package C09Networking;

import java.io.IOException;
import java.sql.*;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException, IOException {
//        useSSL = false -> 보안 처리를 따로 하지 않겠다.
//        mysql 드라이버가 필요
//        ----------------------------- jdbc ----------------------------------
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, userName, password);

        System.out.println("DB 연결 성공");

//        statement : 쿼리를 담아 db로 쿼리전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM post";
        ResultSet rs = st.executeQuery(myQuery);
        int id = 0;
        String title = "";

        while (rs.next()){
            id = rs.getInt("id");
            title = rs.getString("title");
            System.out.println("ID는 " + id + " title은 " + title);
        }
    }
}
