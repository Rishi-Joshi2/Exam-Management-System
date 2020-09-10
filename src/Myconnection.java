import java.sql.*;


public class Myconnection {
    public static Connection getConnection(){
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/exam", "your-mysql-database-username", "your-mysql-database-password");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
