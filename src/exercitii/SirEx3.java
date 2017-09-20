package exercitii;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by hp on 02.08.2017.
 */
public class SirEx3 {
    public static void main(String[] args) {
        int[] a = {23,1,34,54,3,7,5,12,5,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int max = Math.max(3,5);
        System.out.println(max);

        Random rand = new Random();
        int numar = rand.nextInt(50);
        System.out.println(numar);

        int altNumar = (int) Math.random()*10 +1;
        System.out.println(altNumar);
    }
}
