import java.util.Arrays;

public class Simple {
    static int count = 0; // Static variable
    double f;
    int[] arr = { 10, 20, 30 };
    String s1;

    // Constructor
    public Simple() {
        count++; // Increment the static variable
        // System.out.println(f);
        // System.out.println("array" + Arrays.toString(arr));
        // System.out.println("array" + arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("item of arr" + arr[i]);
        // }
        // System.out.println("string:" + s1);
        System.out.println("Hello Java");
        int a = 10;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a++);

    }

    public void showCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String args[]) {
        System.out.println("Hello Java");
        Simple counter1 = new Simple();
        counter1.showCount();
        // Simple counter2 = new Simple();
        // counter2.showCount();
        // int a = 1;
        // do {
        // System.out.println(a);
        // if (a == 5) {
        // break;
        // }
        // a++;
        // } while (a <= 10);
        // aa: for (int i = 1; i <= 3; i++) {
        // bb: for (int j = 1; j <= 3; j++) {
        // if (i == 2 && j == 2) {
        // continue aa;
        // }
        // System.out.println("Outer" + i + " " + "Inner" + j);
        // }
        // }

        System.out.println("Before");
        // \u000d
        System.out.println("Middle");
        System.out.println("After");
    }
}
