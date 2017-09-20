/**
 * Created by hp on 09.08.2017.
 */
public class Caine extends Animal{

    public Caine(String nume, int varsta, String culoare) {
        this.varsta = varsta;
        this.nume = nume;
        this.culoare = culoare;
    }

    @Override
    public void exprima() {
        System.out.println("Ham Ham!");
    }
}