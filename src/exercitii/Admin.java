package exercitii;

import exercitii.sectiunea11.Angajat;

import java.sql.*;

/**
 * Created by hp on 13.09.2017.
 */
public class Admin {
    public static void main(String[] args) {
        String dbUr1 = "jdbc:postgresql:administratie";
        String user = "postgres";
        String password = "Rr123456";

        try {
            Connection myConn = DriverManager.getConnection(dbUr1, user, password);
            System.out.println("Ce fain!!!");
            Statement myStmt = myConn.createStatement();

            Angajat pers1 = new Angajat(1, "Ana", "Strada Buna", 2000);
            Angajat pers2 = new Angajat(2, "Ion", "Strada Antim", 2000);
            Angajat pers3 = new Angajat(3, "Petru", "Strada Padis", 5000);









           /* String crTable = "CREATE TABLE angajatNou(" +
                    "pk_id int PRIMARY KEY NOT NULL," +
                    "nume char (60)," +
                    "adresa char (120)," +
                    "salariu real);" ;
            myStml.executeUpdate(crTable);

           /*
            String db = "create database myNewDb";
            String dc1Db = "drop database myNewDb"; */

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nu a mers");
        }
    }
}
