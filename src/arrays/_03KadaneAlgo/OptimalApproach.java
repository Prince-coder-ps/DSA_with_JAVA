package arrays._03KadaneAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class OptimalApproach {
    public static int maxSum(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum  > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Array's Elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Maximum Sum is : " + maxSum(arr));
    }
}
