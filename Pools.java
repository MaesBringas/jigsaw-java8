/*
 * Pools
 * @author mebs 
 * @version 1.0
 */

import java.util.Random;

public class Pools {
    public static void main(String[] args){
        int results = 15;
        int match = 38;
        char[] lottery = new char[results];
        char[][] season = new char[match][results];
        int[] values = new int[] {'1','X','2'};
        Random r = new Random();

        for(int i = 0; i < lottery.length; i++) {
            lottery[i] = (char) values[r.nextInt(values.length)];
            System.out.println(lottery[i]);
        }

        for(int column = 0; column < match; column++) {
            for(int row = 0; row < results; row++){
                season[column][row] = (char) values[r.nextInt(values.length)];
                System.out.print(" " + season[column][row] + " ");
            }
            System.out.print('\n');
        }
    }

}
