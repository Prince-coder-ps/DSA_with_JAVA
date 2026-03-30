package arrays;
import java.util.*;

public class LongestSubArray {
    public static int longestArray(int[] arr, int k) {

        /* ************** Brute Approach ************** */

//        int n = arr.length;
//        int max_length = 0;
//
//        for(int startIdx = 0; startIdx < n; startIdx++){
//            // ending index
//            for(int endIdx = startIdx; endIdx < n; endIdx++){
//                // add all element of subArray
//
//                int sum = 0;
//                for(int i = startIdx; i <= endIdx; i++){
//                    sum += arr[i];
//                }
//
//                if(sum == k){
//                    max_length = Math.max(max_length, endIdx-startIdx+1);
//                }
//            }
//        }
//        return max_length;

        /* **************** Better Approach : HASHING ************ */

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int sum = 0;
//        int maxLength = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            sum +=arr[i];
//
//            if(sum == k){
//                maxLength = i+1;
//            }
//            if(map.containsKey(sum-k)){
//                int length = i - map.get(sum-k);
//                maxLength = Math.max(maxLength, length);
//            }
//
//            if(!map.containsKey(sum)){
//                map.put(sum,i);
//            }
//        }

        /* ******* Optimal Approach using Two Pointers ******* */

        int n = arr.length;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int sum = arr[0];

        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right-left+1);
            }
            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {9, -3, 3, -1, 6, -5};
        System.out.print("K : ");
        int k = sc.nextInt();

//        System.out.print("Size : ");
//         int n = sc.nextInt();
//
//         int[] arr = new int[n];
//
//        System.out.print("Array's Element : ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Array : " + Arrays.toString(arr));

       int result =  longestArray(arr, k);

        System.out.println("Longest Array's : "+ result);

    }
}
