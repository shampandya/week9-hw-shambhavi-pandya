package prog2_12;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashMap;

public class Prog9_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Audi", 1);
        people.put("Tesla", 2);
        people.put("Nissan", 3);
        people.put("Toyota", 4);
        people.put("BMW", 5);
        // System.out.println(people.entrySet()); to print all the entry value/set

        for(Object i : people.keySet()){               // keySet() method will bring all the key value here placed in String type
            System.out.println(i+ " " +people.get(i) ); // reaymade get() method to bring all the values
        }
    }
}
