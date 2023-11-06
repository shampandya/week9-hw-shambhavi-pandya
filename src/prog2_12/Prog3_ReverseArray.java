package prog2_12;
/**
 * 3. Write a Java program to reverse an array of integer values.
 */

import java.util.Scanner;

public class Prog3_ReverseArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            reverseArray(arr);

            System.out.println("Reversed array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            scanner.close();
        }

        public static void reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                // Swap the elements at the start and end positions
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                // Move the start index forward and end index backward
                start++;
                end--;
            }
        }
    }
