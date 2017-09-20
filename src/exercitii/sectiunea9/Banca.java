package exercitii.sectiunea9;

/**
 * Created by hp on 17.08.2017.
 */
public class Banca {
    public static void main(String[] args) {
        ContCredit cont1 = new ContCredit("George", 1234,2000,5000);
        cont1.afiseazaSold();
        cont1.depoziteaza(100);
        cont1.afiseazaSold();
        cont1.retrage(200);
        cont1.afiseazaSold();
        cont1.retrage(3000);
        cont1.afiseazaSold();
        cont1.depoziteaza(-100);
        cont1.afiseazaSold();
        cont1.retrage(4000);
        cont1.afiseazaSold();
    }
}
