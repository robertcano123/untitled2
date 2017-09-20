/**
 * Created by hp on 09.08.2017.
 */
public class Curte {
    public static void main(String[] args) {
        Caine grivei = new Caine("Grivei", 2, "gri");
        grivei.prezentare();
        grivei.mananca();
        grivei.doarme();
        grivei.exprima();

        Caine max = new Caine("Max", 3, "verde");
        max.prezentare();
        max.mananca();
        max.doarme();
        max.exprima();

        Pisica jerry = new Pisica("Jerry",1, "sura");
        jerry.prezentare();
        jerry.mananca();
        jerry.doarme();
        jerry.exprima();
    }
}
