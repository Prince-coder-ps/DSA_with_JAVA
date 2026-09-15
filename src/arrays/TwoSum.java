package arrays;

import java.util.*;

public class TwoSum {
    // ============== Brute Force Approach -================== //
//    public static String twoSumExists(int [] nums, int k) {
//        int n = nums.length ;
//
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if( nums[i]+nums[j] == k ){
//                    return "YES";
//                }
//            }
//        }
//        return "NO";
//    }
//    public static int[] twoSumIndicies(int[] nums, int k) {
//        int n = nums.length ;
//
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if( nums[i]+nums[j] == k ){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    // ============= Better Approach - HashMAp =============== //

    public static String twoSumExists(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i< n; i++){
            int remain = k - nums[i];

            if(map.containsKey(remain)){
                return "YES";
            }
            map.put(nums[i],i);
        }
        return "NO";
    }
    public static int[] twoSumIndicies(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i< n; i++){
            int remain = k - nums[i];

            if(map.containsKey(remain)){
                return new int[]{map.get(remain), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("K : ");
        int k = sc.nextInt();

//        System.out.println("Sum Exit : "+ TwoSum.twoSumExists(arr, k));
        System.out.println("Indices : "+Arrays.toString(twoSumIndicies(arr, k)));

    }
}
