import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;  
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/event_management", 
                    "root",                                         
                    "veni123"                                       
            );
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
//javac -cp "lib/mysql-connector-j-9.5.0.jar" src/*.java -d bin
//java -cp "bin:lib/mysql-connector-j-9.5.0.jar" Main