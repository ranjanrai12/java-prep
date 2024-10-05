
// The Scanner class is part of java.util package, and it's used to take input from the user
import java.util.Scanner;

public class EvenOdd {
    // main method
    public static void main(String[] args) {
        // creating scanner object
        Scanner scan = new Scanner(System.in);
        Helper helper = new Helper();
        // prompting the user for input
        System.out.print("Enter the number:");
        // reading input
        int num = scan.nextInt();
        // Call the method in Helper class to find if number is even or odd
        helper.findEvenOdd(num);
    }

}

// user defined method
class Helper {
    public void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}