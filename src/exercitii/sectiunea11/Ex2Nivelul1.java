package exercitii.sectiunea11;

import java.util.Scanner;

/**
 * Created by hp on 17.08.2017.
 */
public class Ex2Nivelul1 {
    public static void main(String[] args) {
        System.out.println("Scrieti un numar");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x%2==0) {
            System.out.println("Numarul este par");
        }
        else
            System.out.println("Numarul este impar");
        }
    }
