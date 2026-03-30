package hashing;

import java.util.*;

public class CountFrequency {
    static void frequency(int [] arr, int n){
        // HashMap to store frequency to each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // traverse -> Array & count frequency
        for(int i = 0; i < n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        // Traverse -> HashMAp & print frequencies
        for(Map.Entry<Integer,Integer>e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array's Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // Call the frequency fn
        frequency(arr, size);
    }
}
