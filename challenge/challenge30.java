package challenge;
import java.util.*;

public class challenge30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row lenght: ");
        int row = sc.nextInt();
        System.out.print("Enter the column lenght: ");
        int col = sc.nextInt();

        for(int r = 0; r<row; r++){
            for(int c = 0; c< col; c++){
                if( (c == 0) || ( c == col-1 && (r != 0 && r != row-1 && r != row/2) ) ){
                    System.out.print("*");
                }else if( (r == 0 || r == row-1 || r == row/2) && (c >0 && c< col-1) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}