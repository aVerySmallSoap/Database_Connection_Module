package Interface;

import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("unused")
public interface Connector {

    /**
     * Retrieves a database connection from the specified URL
     * @param URL address to access and connect
     * @return Connection
     * @throws SQLException Generic exception for SQL
     */
    Connection getConnection(String URL) throws SQLException;

    /**
     * Retrieves a database connection from the specified URL. <br>
     * Passing null or empty strings will default the username and password to both root.
     * @param URL address to access and connect
     * @param user connection username
     * @param pass connection password
     * @return Connection
     * @throws SQLException Generic exception for SQL
     */
    Connection getConnection(String URL, String user, String pass) throws SQLException;
}
