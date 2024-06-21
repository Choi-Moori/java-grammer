package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0904Webserver3 {
    public static void main(String[] args) throws SQLException, IOException {
//        useSSL = false -> 보안 처리를 따로 하지 않겠다.
//        mysql 드라이버가 필요
//        ----------------------------- jdbc ----------------------------------
        String url = "jdbc:mysql://localhost:3306/webserver3?useSSL=false";
        String userName = "root";
        String password = "1234";
//        ----------------------------- http ----------------------------------
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");
        Socket socket = serverSocket.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = br.readLine()) != null && !line.isEmpty()){
            sb.append(line).append("\n");
        }
        String requestString = sb.toString();
        String firstLine = requestString.split("\n")[0];
        String infos = firstLine.split(" ")[1];
        int count =0;
        String id="";
        String name = "";
        String email = "";

        if(infos.contains("?")){
            String st1 = infos.split("\\?")[1];
            String[] stArr = st1.split("&");
            for(String s : stArr){
                String[] keyValue = s.split("=");
                if(keyValue[0].equals("id")){
                    count = 1;
                    id = keyValue[1];
                }
                else if(keyValue[0].equals("name")) {
                    name = keyValue[1];
                }
                else if(keyValue[0].equals("email")){
                    email = keyValue[1];
                }
            }
        }
//        ---------------------------------------------------------------------

        Connection con = DriverManager.getConnection(url, userName, password);

        System.out.println("\nDB 연결 성공");

//        statement : 쿼리를 담아 db로 쿼리전달하는 객체
        Statement st = con.createStatement();
        String myQuery = "SELECT * FROM Author";
        ResultSet rs = st.executeQuery(myQuery);
        int DBid = 0;
        String DBname = "";
        String DBemail = "";
        String DBpassword = "";


        if(count == 1) {
            while (rs.next()) {
                DBid = rs.getInt("id");
                if (DBid == Integer.parseInt(id)) {
                    DBname = rs.getString("name");
                    DBemail = rs.getString("email");
                    DBpassword = rs.getString("password");
                    System.out.println("이름은 " + DBname + " 이메일은 " + DBemail + " 패스워드는 " + DBpassword);
                }
            }
        }else {
            rs = st.executeQuery(myQuery);
            while (rs.next()) {
                DBname = rs.getString("name");
                DBemail = rs.getString("email");
                if(DBname.equals(name) && DBemail.equals(email)){
                    DBpassword = rs.getString("password");
                    System.out.println("이름은 " + DBname + " 이메일은 " + DBemail + " 패스워드는 " + DBpassword);
                }
            }
        }
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world" + id;
//            UTF-8문자열 return
        socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
//            flush란 일반적으로 변경사항을 확정(반영)하는 것을 의미
        socket.getOutputStream().flush();
        socket.close();

    }
}
