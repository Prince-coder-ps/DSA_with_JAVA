package binarySearch;
import java.util.*;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Element : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Target : ");
        int target = sc.nextInt();

        int result = searchInsert(arr, target);
        System.out.println("Resulted index : " + result);
    }
}
