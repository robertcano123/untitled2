package exercitii;

import java.util.HashMap;

/**
 * Created by hp on 23.08.2017.
 */
public class ExHashMap {
    public static void main(String[] args) {
        HashMap < String, Integer > hmap = new HashMap<String, Integer>();
        hmap.put("mere",5);
        hmap.put("pere", 10);
        hmap.put("caise", 5);
        hmap.put("piersici", 7);
        System.out.println(hmap);
        hmap.put("piersici", 10);
        System.out.println(hmap);

    }
}
