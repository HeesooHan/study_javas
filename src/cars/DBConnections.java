package cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnections {
    public Statement createConnection(String url, String user, String password) {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            Statement statement = connection.createStatement();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return Statement;
    }
}
