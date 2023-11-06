package prog2_12;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Prog4_ColoursWithArrayList {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<String>();
        al.add("Red");
        al.add("Orange");
        al.add("Yellow");
        al.add("Black");
        al.add("White");
        al.add("Purple");
        al.add("Green");
        al.add("Gray");
        al.add("Blue");

        System.out.println(al);
        for(String s : al){
            System.out.println("Print all the Colours : " +s);
        }
    }

}
