package Interface;

import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("unused")
public interface Connector {
    Connection getConnection(String URL) throws SQLException;
    Connection getConnection(String URL, String user, String pass) throws SQLException;
}
