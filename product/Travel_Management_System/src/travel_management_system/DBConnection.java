package travel_management_system;
import java.sql.*;

public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/traveldatabase";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB()
    {   
        Connection conn = null;
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           return conn;
        }
        catch(Exception ex)
        {
            System.out.println("There were errors connecting to the database.");
            return null;
        }
    }
}
