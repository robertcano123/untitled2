package exercitii;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by hp on 23.08.2017.
 */
public class Ghiceste {
    public static void main(String[] args) {
        Random rand = new Random();
        int numarCorect = rand.nextInt(10) + 1;
        boolean stop = false;
        do {
            System.out.println("Introduceti numarul");
            Scanner scanner = new Scanner(System.in);
            int numarGhicit = scanner.nextInt();
            if (numarGhicit > numarCorect)
                System.out.println("Incercati un numar mai mic");
            else if (numarGhicit < numarCorect)
                System.out.println("Incercati un numar mai mare");
            else {
                System.out.println("Corect! Felicitari!");
                stop = true;
            }
        } while (!stop);
    }
}
