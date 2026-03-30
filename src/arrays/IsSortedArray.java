package arrays;

import java.util.*;


public class IsSortedArray {
    public static boolean isSortedArray(int [] arr,int i){
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSortedArray(arr, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

      boolean result = isSortedArray(arr,0);
        System.out.println("Array's is sorted : "+ result);
    }
}
