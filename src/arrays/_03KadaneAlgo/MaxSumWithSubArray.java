package arrays._03KadaneAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumWithSubArray {
    public static int solution(int[] nums){
        int max = Integer.MIN_VALUE;
        int start = 0;
        int ansStart = -1, ansEnd = -1;

        int sum = 0;

        for(int i = 0; i< nums.length; i++){
            if(sum == 0){
                start = i;
            }

            sum += nums[i];

            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
    // print the Sub-Array which contains the maximum sum of the Elements.
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
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

        System.out.println("Maximum Sum is : " + solution(arr));
    }
}
