package exercitii.sectiunea11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by hp on 13.09.2017.
 */
public class Angajat {
        int id;
        String nume;
        String adresa;
        double salariu;

    public Angajat(int id, String nume, String adresa, double salariu) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.salariu = salariu;
    }

    public void inregistreaza(Statement, stmt , String table);
    String reg = "insert into " + table
            + "(pk_id,nume,adresa,salariu)
}