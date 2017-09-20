package exercitii.sectiunea11;

import java.util.Scanner;

/**
 * Created by hp on 17.08.2017.
 */
public class Nivelul1 {
    public static void main(String[] args) {
        int numar;
        System.out.println("Scrieti un numar");
        Scanner scanner = new Scanner(System.in);
        numar = scanner.nextInt();
        if (numar>0)
            System.out.println("Numarul este pozitiv");
        else if (numar<0)
            System.out.println("Numarul este negativ");
        else
            System.out.println("Numarul este 0");
    }
}
