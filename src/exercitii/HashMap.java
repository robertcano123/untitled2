package exercitii;

/**
 * Created by hp on 23.08.2017.
 */
public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap< String, Integer > hmap = new java.util.HashMap<String, Integer>();
        hmap.put("Maria", 5000);
        hmap.put("Ioan", 3000);
        hmap.put("Ion", 3500);
        hmap.put("Marco", 1000);
        System.out.println(hmap);
        hmap.remove("Ioan");
        System.out.println(hmap);
        Object angajati = hmap.containsValue(3500);
        System.out.println(angajati);
        System.out.println(hmap.clone());
    }
}
