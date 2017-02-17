
/* 
 * TailHead.java
 * @author mebs
 * @since october 2016
 * @version 1.0
 */

import java.util.Scanner;
import java.util.HashMap;


public class TailHead {

    public static class Player {
        public int score;
        public boolean coin;
        public String name;

        public boolean launchCoin(String name) {
            coin = Math.random() < 0.5;
            if (coin == false)
                System.out.println(name + " has got TAIL");
            else if (coin == true)
                System.out.println(name + " has got HEAD");
            return coin;
        
        }
    }
    public static void main (String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        p1.name = "Player 1";
        p2.name = "Player 2";
        p3.name = "Player 3";

        p1.score = 0;
        p2.score = 0;
        p3.score = 0;

        for (int i = 1; i <= 10; i++) {
        
            System.out.println("\nNew round -------------------------------------");
            p1.launchCoin(p1.name);
            p2.launchCoin(p2.name);
            p3.launchCoin(p3.name);
            System.out.println("The round " + i + "has been:");

            if (p1.coin == p2.coin && p1.coin == p3.coin) 
                System.out.println("No winner in round " + i);
            else if (p1.coin == p2.coin) {
                System.out.println(p3.name + " has been the winner for round " + i);
                p3.score++;
            }
            else if (p1.coin == p3.coin) {
                System.out.println(p2.name + " has been the winner for round " + i);
                p2.score++;
            }
            else if (p2.coin == p3.coin){
                System.out.println(p1.name + " has been the winner for round "+ i);
                p1.score++;
            }
            System.out.println("THE CURRENT SCORE IS: " + i);
            System.out.println(p1.name + "-->" + p1.score + " POINTS ");
            System.out.println(p2.name + "-->" + p2.score + " POINTS ");
            System.out.println(p3.name + "-->" + p3.score + " POINTS ");
        } 

        //System.out.println("FINAL RESULTS FOR: " + p1.name + " --> " + p1.score);
        //System.out.println("FINAL RESULTS FOR: " + p2.name + " --> " + p2.score);
        //System.out.println("FINAL RESULTS FOR: " + p3.name + " --> " + p3.score);

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(p1.name, p1.score);
        scores.put(p2.name, p2.score);
        scores.put(p3.name, p3.score);
        System.out.println("And the winner is... " + scores.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey() + "!!");
    }
}
