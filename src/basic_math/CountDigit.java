package basic_math;
import java.util.*;
public class CountDigit {

//    TC = O(1); using log approach
    public static int countDigits(int n) {
        int cnt = 0;
        if(n<0){
            n = Math.abs(n);
        }
        if(n == 0) return 1;

        while(n > 0){
            int remender = n % 10;
            cnt++;
            n = n/10;
        }
        return cnt;
    }
    public static int reverseNumber(int n){
        int sign = 1;
        int revNum = 0;

        if(n < 0){
            sign = -1;
            n = Math.abs(n);
        }

        while(n>0){
            int remender = n % 10;

        // Chect the condition of Overflow 2^31
            if(revNum > Integer.MAX_VALUE/10 || (revNum == Integer.MAX_VALUE/10 && remender > 7)){
                return 0;
            }

            revNum = (revNum * 10) + remender;
            n = n/10;
        }
        return sign * revNum;
    }

    // number palindrome
    public static boolean palindrome(int n){
        int copyOfNum = n;
        int revNum =0;

        while(n>0){
            int rem = n%10;

            if(revNum > Integer.MAX_VALUE/10 ||(revNum == Integer.MAX_VALUE/10 && rem > 7)){
                return false;
            }

            revNum = revNum*10 + rem;
            n = n/10;
        }
        if(revNum == copyOfNum) return true;
        else return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int n = sc.nextInt();

        // digit count
        System.out.print("Digit's count is : ");
        System.out.println(countDigits(n));     // optimal solution

        // Reverse Number
        System.out.print("Reverse number : ");
        System.out.println(reverseNumber(n));

        // Number palindrome
        System.out.print("Number Palindrome : ");
        System.out.println(palindrome(n));



        sc.close();
    }
}
