package arrays;
import java.util.*;
public class MoveZeroes {
    public static  void moveZeroes(int [] nums){
//        if(nums.length == 1) return;
        for(int i = 0; i < nums.length; i++){
            for(int j=i; j<nums.length-1; j++){
                if(nums[j] == 0){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Array is : " + Arrays.toString(nums) );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int n = sc.nextInt();
        int [] nums = new int[n];

        System.out.print("Array's Elements : ");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Original Array is : "+ Arrays.toString(nums));
        moveZeroes(nums);
//        list(nums,n);
    }
}
