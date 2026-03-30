package arrays;

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicate(int [] nums){
        if(nums.length == 0) return 0;

        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return (i+1);
    }
    public  static void expectedArray(int[] nums, int k){
        System.out.print(k + ", nums = [");
        for(int j = 0; j < nums.length; j++){
            if(j<k){
                System.out.print(nums[j]);
            }else{
                System.out.print("_");
            }
            if(j<nums.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Array's Element : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array with duplicasy : " +Arrays.toString(arr));
        int res = removeDuplicate(arr);
        expectedArray(arr, res);



    }
}
