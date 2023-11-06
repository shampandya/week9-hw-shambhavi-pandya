package prog2_12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Prog5_ArrayList_Iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add("Sham");
        al.add('A');
        al.add(false);

//        System.out.println(al);
//        for(Object a :al){
//            System.out.println(a);
//        }
        Iterator<Object> list = al.iterator();
        while(list.hasNext()){
            System.out.print(list.next()+ " " );
        }
    }
}
