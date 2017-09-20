package exercitii;

import java.util.Scanner;

/**
 * Created by Ioana on 2017-08-02.
 */
public class Peninsula {
    public static void main(String[] args) {
        System.out.println("Ai naufragiat pe o insula.");
        String alegere = plaja();
        boolean jocActiv = true;
        while (jocActiv) {
            switch (alegere) {
                case "epava":
                    alegere = epava();
                    break;
                case "coliba":
                    alegere = coliba();
                    break;
                case "jungla":
                    alegere = jungla();
                    break;
                case "plaja":
                    alegere = plaja();
                    break;
                case "pierdut":
                    jocActiv = false;
                    break;
                case "castigat":
                    jocActiv = false;
                    break;

            }
        }
    }

    public static String plaja() {
        System.out.println("Esti pe plaja. La est e epava. La vest vezi o coliba. La sud ai marea.");
        System.out.println("Ce alegi?");
        System.out.println("1. Mergi la est");
        System.out.println("2. Mergi la vest");
        System.out.println("3. Mergi la sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "plaja";
        switch (alegere){
            case 1: optiune = "epava"; break;
            case 2: optiune = "coliba"; break;
            case 3: optiune = "pierdut";
                System.out.println("Ai intrat in mare si din pacate ai iesit din joc");
                break;
        }
        return optiune;
    }
    public static String epava() {
        System.out.println("Ai ajuns la vaporul cu care ai calatorit. La vest e plaja.");
        System.out.println("Vaporul este stricat.");
        System.out.println("Ce alegi?");
        System.out.println("1. Mergi la vest");
        System.out.println("2. Repara vaporul");
        System.out.println("3. Mergi la sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "epava";
        switch (alegere) {
            case 1: optiune = "plaja"; break;
            case 2: optiune = "castigat";
                System.out.println("Ai reusit sa repari vaporul. Te-ai intors acasa. Ai castigat!!!!");
                break;
            case 3: optiune = "pierdut";
                System.out.println("Ai intrat in mare si din pacate ai iesit din joc"); break;
        }
        return optiune;
    }
    public static String coliba() {
        System.out.println("Ai ajuns la o coliba. In spate sta un mos. La est ai plaja.");
        System.out.println("Ce alegi?");
        System.out.println("1. Vorbeste cu mosul");
        System.out.println("2. Mergi spre est");
        System.out.println("3. Mergi spre sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "coliba";
        switch (alegere) {
            case 1: optiune = "castigat";
                System.out.println("Mosul are un vaporas pe partea opusa a insulei. Te duce pana la portul cel mai apropiat.");
                System.out.println("Ai reusit sa te intorci acasa! Felicitari! Ai castigat!!!");
                  break;
            case 2: optiune = "jungla"; break;
            case 3: optiune = "pierdut";
                System.out.println("Ai intrat in mare si ai iesit din joc!"); break;
        }
        return optiune;
    }
    public static String jungla() {
        System.out.println("Ai ajuns in jungla. In fata este un urs. La nord ai un vulcan.");
        System.out.println("Ce alegi?");
        System.out.println("1. Mergi prin jungla");
        System.out.println("2. Fugi de urs");
        System.out.println("3. Mergi spre nord");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "jungla";
        switch (alegere) {
            case 1:
                optiune = "castigat";
                System.out.println("In jungla vei gasi un trib amerindian. Te vor ajuta ei sa ajungi pe mal.");
                System.out.println("Ai reusit sa te intorci acasa! Felicitari! Ai castigat!!!");
                break;
            case 2:
                optiune = "urs";
                System.out.println("Ai reusit sa stabilesti noi recorduri la alergare. Ai reusit sa ii pierzi urma ursului.");
                break;
            case 3:
                optiune = "pierdut";
                System.out.println("Corpul uman nu poate suporta aceste temperaturi si ai iesit din joc!");
                break;
        }
        return optiune;
    }
}

