package lfa.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author noel.oliveira
 * @version 1.0
 * @since 1.3.18
 */
public class dbconnection {
    public static Connection getConnection () {

        //Database url
        String url = "jdbc:mysql://localhost/LFA_Lernende";

        //Database lernende name for Login
        String user = "root";

        //Database password for Login
        String password = "";

        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}

