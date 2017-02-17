
/* 
 * Coins.java
 * @author mebs
 * @since october 2016
 * @version 1.0
 */


import java.util.Scanner;

public class Coins {
    
    static int divisors[] = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200,100,50,20,10,5,2,1};
    static int i = 0;

    public static int division(int rest, int[] divisors) {
        if(rest < divisors[14]){
            return 0;  
        }
        else
            System.out.println( divisors[i]/100.0 + " €: " +rest/divisors[i]);
            int r = rest%divisors[i];
            i++;
            return division(r, divisors);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount > ");
        double a = sc.nextDouble();
        a = a*100;
        int amount =(int) a;

        division(amount, divisors);

    }

}
