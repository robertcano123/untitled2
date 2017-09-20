package exercitii;

import java.util.Scanner;

/**
 * Created by hp on 02.08.2017.
 */
public class ExNumereRanduri {
    public static void main(String[] args) {
        System.out.println("Scrieti un numar");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();

        for (int i = 0; i <=numar ; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println("");
        }
    }
}
