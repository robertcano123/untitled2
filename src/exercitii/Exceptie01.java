package exercitii;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by hp on 23.08.2017.
 */
public class Exceptie01 {
        public static void main(String[] args) {
            System.out.println("Scrieti un numar");
            boolean stop = false;
            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    int i = scan.nextInt();
                    System.out.println("Numarul este " + i);
                    stop = true;
                } catch (InputMismatchException e) {
                    System.out.println("Nu ati introdus un numar");
                }
            } while (!stop);
        }
}
