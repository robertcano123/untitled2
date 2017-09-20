package exercitii.birou;

/**
 * Created by hp on 24.08.2017.
 */
public class CEO extends Angajat{
    private int bonus;

    public CEO(String nume, int CNP, String adresa, int salariu, int bonus) {
        super(nume, CNP, adresa, salariu);
        this.bonus = bonus;
    }
    public void Informatii() {
    super.Informatii();
            System.out.println("Bonusul este " + bonus);
    }
}
