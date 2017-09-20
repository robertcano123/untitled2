package exercitii.sectiunea9;

/**
 * Created by hp on 17.08.2017.
 */
public class ContEconomii extends Cont {
    private double dobanda;


    public ContEconomii(String numeClient, int numarCont, int sold, double dobanda) {
        super(numeClient, numarCont, sold);
        this.dobanda = dobanda;
    }
}
