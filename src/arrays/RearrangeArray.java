//Reaarange array's element by Sign
package arrays;

import java.util.*;

public class RearrangeArray {
    public static void ArrayManuplater(int [] nums){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
//        Merge the array
        for(int i = 0; i < nums.length/2; i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1] = neg.get(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Size : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.print("Elements : ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        ArrayManuplater(nums);
        System.out.println("Resulted Array : "+Arrays.toString(nums));
    }
}
