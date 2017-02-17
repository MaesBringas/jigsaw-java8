
/* 
 * GuessYou.java
 * @author mebs
 * @since october 2016
 * @version 1.0
 */

import java.util.Scanner;

public class GuessYou {
    
    public static void main (String[] args) {
        System.out.println("Let's play! > ");
        Scanner sc = new Scanner(System.in);
        int guess = (int)(Math.random()*100);
        int niceTry = sc.nextInt();
        //System.out.println(guess); 
        while(guess != niceTry) {
            if (guess > niceTry) {
                System.out.println("A little bit more :)");
                niceTry = sc.nextInt();
            }
            else if (guess < niceTry) {
                System.out.println("Less :)");
                niceTry = sc.nextInt();
            }
        }
        System.out.println("You got it! :D");
    }
}
