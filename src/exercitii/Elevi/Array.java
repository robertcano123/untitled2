package exercitii.Elevi;

import sun.awt.util.IdentityArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hp on 29.08.2017.
 */
public class Array {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Ion");
        obj.add("Maria");
        obj.add("Ana");
        obj.add("Petru");
        obj.add("Raluca");
        obj.add("Vali");
        obj.add("Robert");
        System.out.println("Elevii sunt " + obj);
            obj.remove("Raluca");
        System.out.println("Elevii sunt " + obj);
    }
}
