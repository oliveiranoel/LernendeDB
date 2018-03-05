package lfa.backend;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author noel.oliveira
 * @version 1.0
 * @since 1.3.18
 */
public class dataEvaluation {

    public static void printLernende() {
        Connection con = dbconnection.getConnection();
        try {
            String query = "SELECT * FROM lernende;";

            Statement statement = con.createStatement();

            ResultSet set = statement.executeQuery(query);

            System.out.println("+-----+------------+------------+--------+------------------+------------------+------------+");
            System.out.println("| ID  | Nachname   | Vorname    | Alter  | Lernbegleiter    | QPA              | Projekt    |");
            System.out.println("+-----+------------+------------+--------+------------------+------------------+------------+");


            while (set.next()) {
                System.out.println(String.format("| %-4s| %-11s| %-11s| %-7s| %-17s| %-17s| %-11s|", set.getString("id"),
                        set.getString("nachname"), set.getString("vorname"),
                        set.getString("lebensalter"), set.getString("lernbegleiter"),
                        set.getString("qpa"), set.getString("projekt")));
            }
            System.out.println("+-----+------------+------------+--------+------------------+------------------+------------+\n");

        } catch (SQLException ex) {
            Logger.getLogger(dataEvaluation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createLernende() {
        Connection con = dbconnection.getConnection();
        Scanner sc = new Scanner(System.in);
        Integer alter;
        String nachname, vorname, lernbegleiter, qpa, projekt;

        System.out.println("Geben sie den Nachnamen ein: ");
        nachname = sc.next();
        sc.nextLine();
        System.out.println("Geben sie den Vornamen ein: ");
        vorname = sc.nextLine();
        System.out.println("Geben sie das Lebensalter ein: ");
        alter = sc.nextInt();
        System.out.println("Geben sie den Lernbegleiter ein: ");
        lernbegleiter = sc.next();
        sc.nextLine();
        System.out.println("Geben sie den QPA ein: ");
        qpa = sc.nextLine();
        System.out.println("Geben sie das Projekt ein: ");
        projekt = sc.nextLine();

        try {
            String query = "INSERT INTO lernende (nachname, vorname, lebensalter, lernbegleiter, qpa, projekt) VALUES (?, ?, ?, ?, ?, ?);";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, nachname);
            preparedStmt.setString(2, vorname);
            preparedStmt.setInt(3, alter);
            preparedStmt.setString(4, lernbegleiter);
            preparedStmt.setString(5, qpa);
            preparedStmt.setString(6, projekt);

            preparedStmt.execute();

            System.out.println("Lernende/r wurde hinzugefügt!\n");
        } catch (SQLException ex) {
            Logger.getLogger(dataEvaluation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteLernende() {
        Connection con = dbconnection.getConnection();
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Geben Sie die ID des zu löschenden Lernenden ein: ");
        id = sc.nextInt();
        try {
            String query = "DELETE FROM lernende WHERE id = ?;";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, id);

            preparedStmt.executeUpdate();
            System.out.println("Lernende/r wurde gelöscht!\n");
        } catch (SQLException ex) {
            Logger.getLogger(dataEvaluation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


