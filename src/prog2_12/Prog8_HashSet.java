package prog2_12;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Prog8_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(4);
        hs.add(7);
        hs.add(8);
        System.out.println(hs);

        for(int i = 1; i <= 10; i++){
            if(hs.contains(i)){
                System.out.println(i+ " " );
            }else{
                System.out.println("Value not available  in the set");
            }
        }
    }
}
