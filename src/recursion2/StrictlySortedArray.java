package recursion2;
import java.util.*;
public class StrictlySortedArray {
    public static boolean arrayCheck(int[] arr, int idx){
//        base case
        if(idx == arr.length-1){
          return true;
        }
        if(arr[idx] < arr[idx+1]){
            return arrayCheck(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int  size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arrayCheck(arr,0));


    }

}
