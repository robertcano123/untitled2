package exercitii.birou;

/**
 * Created by hp on 24.08.2017.
 */
public class Programator extends Angajat {
    // junior, middle, senior
    String treapta;
    public Programator(String nume, int CNP, String adresa, int salariu, String treapta) {
        super(nume, CNP, adresa, salariu);
        this.treapta = treapta;
    }
}
