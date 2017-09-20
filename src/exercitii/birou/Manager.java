package exercitii.birou;

/**
 * Created by hp on 24.08.2017.
 */
public class Manager extends Angajat{
private int bonus;
    public Manager(String nume, int CNP, String adresa, int salariu, int bonus) {
        super(nume, CNP, adresa, salariu);
        this.bonus = bonus;
    }
}
