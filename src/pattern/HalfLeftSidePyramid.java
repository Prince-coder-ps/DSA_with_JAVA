package pattern;
import java.util.*;
public class HalfLeftSidePyramid {
    static void HalfRytSidePyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=(n-i); k++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Number : ");
        int n = sc.nextInt();
        System.out.println("Half left side pyramid : ");
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Half Right side pyramid : ");
        HalfRytSidePyramid(n);
        sc.close();
    }
}
