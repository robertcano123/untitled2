/**
 * Created by hp on 09.08.2017.
 */
public class Animal {
    int varsta;
    String nume;
    String culoare;

    public void mananca() {
        System.out.println("mananca ...");
        }
    public void doarme() {
            System.out.println("doarme ...");
        }
    public void exprima() {
            System.out.println("mmmm ...");
        }
    public void prezentare() {
            System.out.println("Se numeste " + nume);
            System.out.println(nume + " are " + varsta + " ani");
            System.out.println("Culoarea este " + culoare);
        }
}
