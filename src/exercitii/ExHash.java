package exercitii;

import java.util.Scanner;

/**
 * Created by hp on 02.08.2017.
 */
public class ExHash {
    public static void main(String[] args) {
        System.out.println("Cate semne pe rand?");
        Scanner scanner = new Scanner(System.in);
        int coloane = scanner.nextInt();
        System.out.println("Cate randuri?");
        int randuri = scanner.nextInt();

        for (int j = 1; j <=randuri; j++) {
            for (int i = 1; i <= coloane; i++)
                System.out.print("#");
            System.out.println("");
        }
    }
}
