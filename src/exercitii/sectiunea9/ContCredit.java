package exercitii.sectiunea9;

/**
 * Created by hp on 17.08.2017.
 */
public class ContCredit extends Cont {

    private int maxCredit;

    public ContCredit(String numeClient, int numarCont, int sold,int maxCredit) {
        super(numeClient, numarCont, sold);
        this.maxCredit = maxCredit;
    }

    public void retrage(int suma) {
        int sold = getSold();
        if (suma <= sold + maxCredit) {
            setSold(sold - suma);
            System.out.println("S-a efectuat tranzactia");
        }
        else
            System.out.println("Nu se poate efectua tranzactia");
    }
}
