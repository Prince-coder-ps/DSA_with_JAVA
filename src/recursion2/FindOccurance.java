package recursion2;
import java.util.*;
public class FindOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str,char element,int index){

//Base case
        if(index == str.length()){
            System.out.println("First Occurance : "+first);
            System.out.println("Last Occurance : "+last);
            return;
        }
        char currentChar = str.charAt(index);
        if(currentChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        findOccurance(str,element, index+1);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("str : ");
        String str = sc.nextLine();

        System.out.print("char : ");
        char element = sc.next().charAt(0);

        findOccurance(str,element,0);
    }

}
