/**
 * Created by hp on 09.08.2017.
 */
public class Pisica extends Animal {

    public Pisica (String nume, int varsta, String culoare) {
        this.varsta = varsta;
        this.nume = nume;
        this.culoare = culoare;
    }
    @Override
    public void exprima() {
        super.exprima();
        System.out.println("Miau!!!");
    }
}
