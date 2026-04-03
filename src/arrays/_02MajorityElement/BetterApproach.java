package arrays._02MajorityElement;
import java.util.*;
public class BetterApproach {
    public static  int solution(int[] nums){
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer>e : map.entrySet()){
            if(e.getValue() > (nums.length)/2){
                return e.getKey();
            }
        }
        return -1;
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

        System.out.println("Majorit Element of the Array is : " + solution(arr));
    }
}
