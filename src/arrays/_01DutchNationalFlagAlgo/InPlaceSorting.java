package arrays._01DutchNationalFlagAlgo;
import java.util.*;
public class InPlaceSorting {
    public static void sorting(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        System.out.println("Sorted Array's : " + Arrays.toString(nums));
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

        System.out.println("Original Array : " +Arrays.toString(arr));

        sorting(arr);
    }
}
