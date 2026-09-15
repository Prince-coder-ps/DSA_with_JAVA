package binarySearch;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size : ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.print("Element : ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Target : ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        System.out.println("index of target value : " +result);
    }
}
