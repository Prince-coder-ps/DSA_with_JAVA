package hashing;
import java.util.*;
public class AppearanceOne {
    public static int appearanceOnesOnly(int [] nums) {
        // HashMap to store frequency to each element
            HashMap<Integer,Integer> map = new HashMap<>();

        // traverse -> Array & count frequency
            for(int num : nums){
                map.put(num,map.getOrDefault(num, 0)+1);
            }

            for(Map.Entry<Integer,Integer>e: map.entrySet()){
                if(e.getValue()==1){
                    return(e.getKey());
                }
            }

            return -1; // fallback, won't be hit if array has a single element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Array's element : ");
        for(int i= 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Array : ");
        System.out.println(Arrays.toString(nums));


        int result = appearanceOnesOnly(nums);
        System.out.println("Number is : " +result);
    }
}
