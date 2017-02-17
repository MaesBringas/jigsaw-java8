
/* 
 * MatrixGenerator.java
 * @author mebs
 * @since october 2016
 * @version 1.0
 */

import java.util.Scanner;

public class MatrixGenerator {

    public static void main (String[] args) {
        System.out.println("Enter N (matrix order) > ");
        Scanner sc = new Scanner(System.in);
        int value = 1;
        int n = sc.nextInt();
        
        for(int column = 0; column < n; column++) {
            for(int row = 0; row < n; row++){
                System.out.print(value + " ");
                if(row == (n - 1)){
                } // value don't change
                else if(value == n) {
                    value = 1;
                } 
                else {
                    value++;
                }
            }
        System.out.print('\n');
        }
    }
}

