package lfa.backend;

import java.util.Scanner;

/**
 * @author noel.oliveira
 * @version 1.0
 * @since 5.3.18
 */
public class Main {

    /**
     * Gibt das Menü aus, welches den Benutzer erlaubt, einen Menüpunkt auszuwählen.
     * @param args
     */
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String eingabe;

        do {
            System.out.println("Welche Operation willst du ausführen?");

            System.out.println("1 - Neuen Lernenden erfassen");
            System.out.println("2 - Lernenden löschen");
            System.out.println("3 - Alle Lernende auflisten");
            System.out.println("q - Beenden");

            System.out.println("Gib eine Nummer ein : ");
            eingabe = sc.nextLine();

            switch (eingabe) {
                case "1":
                    System.out.println("Neuen Lernende erfassen\n");
                    DataEvaluation.createLernende();
                    break;
                case "2":
                    System.out.println("Lernenden löschen\n");
                    DataEvaluation.deleteLernende();
                    break;
                case "3":
                    System.out.println("Alle Lernende auflisten\n");
                    DataEvaluation.printLernende();
                    break;
                case "q":
                    System.out.println("Beenden");
                    System.out.println("BYE");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR: Bitte gültige Zahl eingeben");
            }
        } while (eingabe != "q");

    }
}
