package recursion2;
import java.util.*;

public class ReverseArray {

    public static void reverseArray(int idx, int[] arr) {

        // Proper base case
        if(idx >= arr.length / 2){
            return;
        }

        // swap
        int temp = arr[idx];
        arr[idx] = arr[arr.length - idx - 1];
        arr[arr.length - idx - 1] = temp;

        // recursive call
        reverseArray(idx + 1, arr);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the array's elements : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(0, arr);

        // print after reversing
        System.out.println(Arrays.toString(arr));
    }
}