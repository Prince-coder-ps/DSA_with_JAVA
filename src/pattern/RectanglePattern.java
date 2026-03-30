package pattern;

import java.util.*;

public class RectanglePattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter No of cols : ");
        int col = sc.nextInt();

        // outer loop for rows
        for(int i = 1; i<=row; i++){

            //inner loop for columns
            for(int j = 1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
