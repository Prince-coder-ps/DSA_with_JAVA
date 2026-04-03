package arrays._02MajorityElement;

import java.util.Arrays;
import java.util.Scanner;

public class OptimalApproach {
    public static int solution(int[] nums){
       // using two variable

       int element = 0;
       int cnt = 0;

       for(int i=0; i< nums.length; i++){
           if(cnt == 0){
              element = nums[i];
           }else if( element == nums[i]){
               cnt++;
           }else{
               cnt--;
           }
       }
       // verify the element
        int cnt1 = 0;
       for(int num : nums){
           if(num == element){
               cnt1++;
           }
       }
       if(cnt1 > nums.length/2){
           return element;
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

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Majorit Element of the Array is : " + solution(arr));
    }
}
