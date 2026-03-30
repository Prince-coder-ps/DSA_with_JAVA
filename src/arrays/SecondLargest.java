package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int [] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max){
                secondMax = num;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
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

        int result = secondLargest(arr);
        System.out.println("Second l=argest element : "+ result);
    }
}
