package prog2_12;
/**
 * write a java programme using if else and while loop and scanner for below requirement:
 * Write a java program to input student Name, roll No, and three subjects Math, Science
 * and English marks (marks is between 0 to 100 and if it is out of range print error
 * message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _________________________________|
 * |                                |
 * |Mark Sheet                      |
 * |_______________________________ |
 * | Name : Jay | | Roll No : 08    |
 * |_______________________________ |
 * | Subjects : Marks               |
 * |_______________________________ |
 * | Math : 98                      |
 * | Science : 90                   |
 * | English : 85                   |
 * |_______________________________ |
 * | Total : 273                    |
 * |_______________________________ |
 * | Percentage : 91.0              |
 * | Result : Pass                  |
 * | Grade : A+                     |
 * |________________________________|
 */

import java.util.Scanner;

public class Prog2_Marksheet {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter student Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Roll No: ");
            int rollNo = scanner.nextInt();

            int mathMarks = inputMarks("Math");
            int scienceMarks = inputMarks("Science");
            int englishMarks = inputMarks("English");

            int total = calculateTotal(mathMarks, scienceMarks, englishMarks);
            double percentage = calculatePercentage(total);

            String result = calculateResult(percentage);
            String grade = calculateGrade(percentage);

            printMarkSheet(name, rollNo, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

            scanner.close();
        }

        public static int inputMarks(String subject) {
            int marks;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Enter " + subject + " marks (0-100): ");
                marks = scanner.nextInt();
            } while (marks < 0 || marks > 100);
            return marks;
        }

        public static int calculateTotal(int mathMarks, int scienceMarks, int englishMarks) {
            return mathMarks + scienceMarks + englishMarks;
        }

        public static double calculatePercentage(int total) {
            return (total / 300.0) * 100;
        }

        public static String calculateResult(double percentage) {
            return (percentage >= 35) ? "Pass" : "Fail";
        }

        public static String calculateGrade(double percentage) {
            if (percentage >= 80) {
                return "A+";
            } else if (percentage >= 60) {
                return "A";
            } else if (percentage >= 50) {
                return "B";
            } else if (percentage >= 35) {
                return "C";
            } else {
                return "N/A";
            }
        }

        public static void printMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int total, double percentage, String result, String grade) {
            System.out.println("_____________________________________");
            System.out.println("|                                   |");
            System.out.println("|        Mark Sheet                 |");
            System.out.println("|__________________________________ |");
            System.out.println("| Name : " + name + "               |");
            System.out.println("| Roll No : " + rollNo + "          |");
            System.out.println("|___________________________________|");
            System.out.println("| Subjects : Marks                  |");
            System.out.println("|___________________________________|");
            System.out.println("| Math : " + mathMarks + "          |");
            System.out.println("| Science : " + scienceMarks + "    |");
            System.out.println("| English : " + englishMarks + "    |");
            System.out.println("|___________________________________|");
            System.out.println("| Total : " + total + "             |");
            System.out.println("|___________________________________|");
            System.out.println("| Percentage : " + percentage + "   |");
            System.out.println("| Result : " + result + "           |");
            System.out.println("| Grade : " + grade + "             |");
            System.out.println("|___________________________________|");
        }
    }

