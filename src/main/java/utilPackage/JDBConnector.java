package utilPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnector {

    private static final String url = "jdbc:postgresql://localhost:8080/database";
    private static final String login = "postgres";
    private static final String password = "12345";

    public static Connection connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url,login,password);
            if(connection != null){
                System.out.println("Connection is Successfully");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
