package exercitii.sectiunea9;

/**
 * Created by hp on 17.08.2017.
 */
public class Cont {
    private String numeClient;
    private int numarCont;
    private int sold;


    public Cont(String numeClient, int numarCont, int sold) {
        this.numeClient = numeClient;
        this.numarCont = numarCont;
        this.sold = sold;
    }

    public void afiseazaSold() {
        System.out.println("Soldul este " + sold);
    }

    public void depoziteaza(int suma) {
        if (suma > 0) {
            sold = sold + suma;
            System.out.println("S-a depozitat suma de " + suma);
        }
        else
            System.out.println("Nu se poate depozita o suma negativa");
    }

    public void retrage(int suma) {
        if (suma <= sold) {
            sold = sold - suma;
            System.out.println("S-a efectuat tranzactia");
        }
        else
            System.out.println("Nu se poate efectua tranzactia");
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
