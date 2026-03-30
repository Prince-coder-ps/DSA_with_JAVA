package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {

    public static int largestElement(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
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

        int result = largestElement(arr);
        System.out.println("Largest element : "+ result);
    }
}