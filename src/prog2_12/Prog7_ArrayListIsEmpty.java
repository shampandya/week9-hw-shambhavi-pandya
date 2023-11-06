package prog2_12;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

public class Prog7_ArrayListIsEmpty {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<String>();
        al.add(" Java");
        al.add(" Python");
        al.add(" C");
        al.add(" Ruby");

        System.out.println(al);

        System.out.println(al.isEmpty()); // use method isEmpty to check wether ArrayList is Empty or not
    }
}
