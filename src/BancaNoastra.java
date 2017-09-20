/**
 * Created by hp on 16.08.2017.
 */
public class BancaNoastra {
    public static void main(String[] args) {
        ContCredit cont1 = new ContCredit("Alice",1234,2000, 5000);
        cont1.afiseazaSold();
        cont1.depoziteazaSold(100);
        cont1.afiseazaSold();
        cont1.depoziteazaSold(-100);
        cont1.afiseazaSold();
        cont1.retrageNumerar(200);
        cont1.afiseazaSold();
        cont1.retrageNumerar(2300);
        cont1.afiseazaSold();
    }
}
