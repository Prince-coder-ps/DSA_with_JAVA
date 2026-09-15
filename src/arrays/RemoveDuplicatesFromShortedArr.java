package arrays;
import java. util.*;
public class RemoveDuplicatesFromShortedArr {
    public static void removeDuplicates(int[] nums){
        int k = 1;
        for(int j =1; j < nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[k] = nums[j];
                k += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Size of Array : ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.print("Elements of the Array ; ");
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr);

        System.out.println("Resukted Array : " +Arrays.toString(arr));
    }
}
