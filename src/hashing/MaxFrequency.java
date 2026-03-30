package hashing;

import java.util.*;

public class MaxFrequency {
    static void maxFreq(int [] arr){

        int maxFreq = Integer.MIN_VALUE;
        int maxKey = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer>e : map.entrySet()){
            if(maxFreq < e.getValue()){
                maxFreq = e.getValue();
                maxKey = e.getKey();
            }
        }
        System.out.println("Highest frequency ele : "+ maxKey);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        maxFreq(arr);

    }
}
