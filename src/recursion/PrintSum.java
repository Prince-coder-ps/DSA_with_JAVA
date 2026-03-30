package recursion;

import java.util.Scanner;

public class PrintSum {
    public static int printSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + printSum(n - 1);

    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
//        System.out.println("Sum is : " + printSum(n));
        System.out.println("Factorial is : " + factorial(n));
    }
}
