// 344. Reverse String
package string;

import java.util.*;

public class ReverseString {

    public static void reverseString(char[] str) {

        int left = 0;
        int right = str.length - 1;

        while (left < right) {

            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        char[] str = new char[size];

        System.out.print("Elements: ");

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next().charAt(0);
        }

        reverseString(str);

        System.out.println("Reverse String Array: " + Arrays.toString(str));

        sc.close();
    }
}