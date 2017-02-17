/*
 * GuessNumber
 * @author mebs 
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args){
        int size = 10;
        List<Integer> discarded = new ArrayList<>();
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("I have to guess your number...");
        int attempt=rand.nextInt(10-1) + 1;
        System.out.println("It's correct? Y/N > " + attempt);
        String response = sc.next().toLowerCase();
        char c = response.charAt(0);

        while(c == 'n') {
            if(!discarded.contains(attempt)){
                discarded.add(attempt);
                attempt=rand.nextInt(size-1) + 1;
                while(discarded.contains(attempt)){
                    attempt=rand.nextInt(size-1) + 1;
                }
                System.out.println("It's correct? Y/N > " + attempt);
                response = sc.next().toLowerCase();
                c = response.charAt(0);
                if(c=='y') break;
                if(discarded.size()==size-2) {
                    System.out.println("It's a trap!");
                    break;
                }
            }

        }
        if(c=='y') {
            System.out.println("Got it!");
        }
        System.out.println("GAME OVER");
        
    }
}
