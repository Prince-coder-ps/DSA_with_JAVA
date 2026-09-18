package binarySearch;
import java.util.*;

public class SearchElementInRotatedArray {
    public static int searchInRotatedArray(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] == target ){
                return mid;
            }

            if(nums[low] <= nums[mid] ){

                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target : ");
        int target = sc.nextInt();

        int res = searchInRotatedArray(arr, target);
        System.out.println("index of Target value is : " +res);

        sc.close();
    }
}
