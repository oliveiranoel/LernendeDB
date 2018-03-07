package lfa.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author noel.oliveira
 * @version 1.0
 * @since 5.3.18
 */
public class DbConnection {
    /**
     * Diese Methode stellt eine Verbindung zu einer MySQL Datenbank auf.
     * Datenbankpfad, User und Passwort muss mitgegeben werden.
     * @return - Gibt die Connection zur DB zurück
     */
    public static Connection getConnection () {

        //Database url
        String url = "jdbc:mysql://localhost/LFA_Lernende";

        //Database Lernender name for Login
        String user = "noel.oliveira";

        //Database password for Login
        String password = "noelo";

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

