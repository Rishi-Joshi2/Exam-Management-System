import java.sql.*;


public class Myconnection {
    public static Connection getConnection(){
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
