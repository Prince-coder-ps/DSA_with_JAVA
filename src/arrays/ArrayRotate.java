package arrays;

import java.util.*;

public class ArrayRotate {
    public static void reverseArray(int []arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        if(n == 0) return;

        k = k % n; // normalize : n=5, k=9 : 9%5=4th elements tk rotate

        // k=3, n = 5, arr = [1 2 3 4 5]
        // reverse first k number of elements : [3 2 1 4 5]
        reverseArray(arr, 0, k-1);

        // reverse after the k number of elements(remaining) : [3 2 1 5 4]
        reverseArray(arr, k, n-1);

        // reverse the complete array : [4 5 1 2 3]
        reverseArray(arr,0, n-1);

    }
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        if(n == 0) return;

        k = k % n; // normalize : n=5, k=9 : 9%5=4th elements tk rotate

        // k=3, n = 5, arr = [1 2 3 4 5]
        // reverse first k number of elements : [1 2 5 4 3]
        reverseArray(arr, n-k, n-1 );

        // reverse after the k number of elements(remaining) : [2 1 5 4 3]
        reverseArray(arr, 0, n-k-1);

        // reverse the complete array : [3 4 5 1 2]
        reverseArray(arr,0, n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Array's Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("K : ");
        int k = sc.nextInt();

        leftRotate(arr, k);
        System.out.println("Left Rotation of K = "+k + " is : " +Arrays.toString(arr));

        rightRotate(arr,k);
        System.out.println("Right Rotation of K = "+k + " is : " +Arrays.toString(arr));

    }
}
