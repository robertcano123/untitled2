/**
 * Created by hp on 16.08.2017.
 */
public class ContCredit extends Cont {
    private int credit;
    public ContCredit(String numeClient, int numarCont, int sold, int credit) {
        super(numeClient, numarCont, sold);
        this.credit = credit;
    }

    public void retrageNumerar(int suma) {
        int SoldVechi = getSold();
        if (suma > SoldVechi + credit)
            System.out.println("Nu aveti destule fonduri");
        else {
        int SoldNou = SoldVechi - suma;
            setSold(SoldNou);
            System.out.println("S-a extras " + suma + " ron");
        }
    }
}
