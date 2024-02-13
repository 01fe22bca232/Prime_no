import java.util.Scanner;
/**
 * The Prime_no class is used to determine whether a given number is prime or not.
 */

public class Prime_no {

    // The code `public static void main(String[] args)` is the main method in Java. It is the entry
    // point of the program and is executed when the program is run.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // This code is prompting the user to enter the starting number of a range and then reading the
    // input from the user using the `nextInt()` method of the `Scanner` class. The entered number is
    // then stored in the variable `start`.
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

       // This code is prompting the user to enter the ending number of a range and then reading the
       // input from the user using the `nextInt()` method of the `Scanner` class. The entered number
       // is then stored in the variable `end`.
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

       // The code `System.out.println("Prime numbers in the range " + start + " to " + end + ":");` is
       // printing a message to the console. The message is "Prime numbers in the range" followed by
       // the values of the variables `start` and `end`.
        System.out.println("Prime numbers in the range " + start + " to " + end + ":");
        PrimesInRange(start, end);

       
        scanner.close();
    }

    // The `printPrimesInRange` method is a helper method that takes in two parameters, `start` and
    // `end`, which represent the starting and ending numbers of a range.
    private static void PrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
Prime_no.java
Displaying Prime_no.java.