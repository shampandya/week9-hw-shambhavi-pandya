package prog2_12;
/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Prog6_ArrayListElement_Retrive {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();   // Syntax to  declare multiple type value /object arraylist
        al.add(123);     // add() is a method to add any object value into ArrayList
        al.add("Pan");
        al.add('H');
        al.add(12.53);
        al.add(0.893);
        al.add("Java");
        al.add(false);

        System.out.println((al));  // will print all the object value
        System.out.println("Retrieve an index number 6 : "+al.get(6));  // use of method get() to retrieve an specific index element
        System.out.println("Retrieve an index number 5 : "+al.get(5));
        System.out.println("Retrieve an index number 4 : "+al.get(4));
        System.out.println("Retrieve an index number 3 : "+al.get(3));
        System.out.println("Retrieve an index number 2 : "+al.get(2));
        System.out.println("Retrieve an index number 1 : "+al.get(1));
        System.out.println("Retrieve an index number 0 : "+al.get(0));
    }
}
