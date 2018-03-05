package lfa.backend;

/**
 * @author noel.oliveira
 * @version 1.0
 * @since 1.3.18
 */

public class lernende {
    private String nachname;
    private String vorname;
    private int alter;
    private String lernbegleiter;
    private String qpa;
    private String projekt;

    //Constructor
    public lernende(String nachname, String vorname, int alter, String lernbegleiter, String qpa, String projekt) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
        this.lernbegleiter = lernbegleiter;
        this.qpa = qpa;
        this.projekt = projekt;
    }

    public String getnachname() {
        return nachname;
    }

    public void setnachname(String nachname) {
        this.nachname = nachname;
    }

    public String getvorname() {
        return vorname;
    }

    public void setvorname(String vorname) {
        this.vorname = vorname;
    }

    public int getalter() {
        return alter;
    }

    public void setalter(int alter) {
        this.alter = alter;
    }

    public String getlernbegleiter() {
        return lernbegleiter;
    }

    public void setlernbegleiter(String lernbegleiter) {
        this.lernbegleiter = lernbegleiter;
    }

    public String getqpa() {
        return qpa;
    }

    public void setqpa(String qpa) {
        this.qpa = qpa;
    }

    public String getprojekt() {
        return projekt;
    }

    public void setprojekt(String projekt) {
        this.projekt = projekt;
    }
}

