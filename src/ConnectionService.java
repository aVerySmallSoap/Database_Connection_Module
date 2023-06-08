import Interface.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class ConnectionService implements Connector {
    @Override
    public Connection getConnection(String URL) {
        try{
            return DriverManager.getConnection(URL);
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Connection getConnection(String URL, String user, String pass){
        try{
            return user == null || user.equals("") && pass == null || pass.equals("") ?
                    DriverManager.getConnection(URL, "root", "root") :
                    DriverManager.getConnection(URL, user, pass);
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
