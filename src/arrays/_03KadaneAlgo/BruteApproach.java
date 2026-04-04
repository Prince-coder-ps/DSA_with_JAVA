package arrays._03KadaneAlgo;

import java.util.*;

// Problem Statement: Given an integer array nums, find the subarray with the largest
// sum and return the sum of the elements present in that subarray.
//A subarray is a contiguous non-empty sequence of elements within an array.
public class BruteApproach {
    public  static int maxSum(int[] nums){

        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i =0; i < n; i++){
            int sum = 0;
            for(int j =i; j < n; j++){
                sum += nums[j];

                // Update max with maximum value
                max = Math.max(max, sum);
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
