package arrays.midium;

import java.util.*;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int idx = -1;

        // find break point
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                    idx = i;
                    break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i = nums.length-1; i > idx; i--){
            if( nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
        reverse(nums, idx+1, nums.length-1);

    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    private static void reverse(int [] nums, int left, int right){
        while( left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int size = sc.nextInt();

        int [] nums = new int[size];

        System.out.print("Elements : ");
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next Permutation : " +Arrays.toString(nums));
    }
}
