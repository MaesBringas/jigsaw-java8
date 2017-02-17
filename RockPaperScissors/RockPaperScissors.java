/* 
 * Rock, paper, scissors game
 * @author mebs
 * @version 1.0
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int players, option;
        String pattern = "[a-zA-Z ]+";

        // We select the number of players we have to create
        System.out.println("Select a number of players: ");
        players = sc.nextInt();
        int[] result = new int[players + 1];
        while(players >= 3 || players < 1){
            System.out.println("Number not valid please enter 2 (working in progress)");
            players = sc.nextInt();
        }

        Player[] playerList = new Player[players];

        for(int i = 0; i < playerList.length; i++){
            playerList[i] = new Player();
            System.out.println("Enter player game: ");
            while(!sc.hasNext(pattern)){
                System.out.println("Name not valid, try again");
                sc.next();
            }
            String name1 = sc.next();
            playerList[i].setName(name1);

            System.out.println("Choose a strategy for player "+ i + ": \n" +
                    "1) Random\n" +
                    "2) Cyclic\n" +
                    "3) Copy\n");
            try {
                option = sc.nextInt();
                while(option < 0 || option > 3){
                    System.out.println("Choose an option 1 - 3");
                    option = sc.nextInt();
                }
                playerList[i].setStrategy(playerList[i].setFirstStrategy(option));
                System.out.println("Player " + i + " uses " + getEquivalent(playerList[i].getStrategy()));
            } catch (InputMismatchException e){
                System.err.println("A number! Like 1, 2, 3 ...");
            }
        }
        // Starts 25 rounds
        for (int u = 1; u <= 25; u++){
            System.out.println("------- Round " + u + "-------");
            result = whoWins(playerList[0].getStrategy(), playerList[1].getStrategy(), result);
            System.out.println("The winner is " + getEquivalent(result[result.length-1]));

            // Modify the parameters for each player
            for(int y = 0; y < playerList.length; y++) {

                Random r = new Random();
                playerList[y].setScore(result[y]);

                if (!playerList[y].getCyclic() && !playerList[y].getCopy()) {
                    playerList[y].setStrategy(r.nextInt(4 - 1) + 1);
                    System.out.println("Now player " + y + " chooses " + getEquivalent(playerList[y].getStrategy()) + " for the next round");
                } else if (playerList[y].getCyclic()) {
                    playerList[y].setStrategy(u % 3 + 1);
                    System.out.println("Now player " + y + " chooses " + getEquivalent(playerList[y].getStrategy()) + " for the next round");
                }else if (playerList[y].getCopy()) {
                    playerList[y].setStrategy(result[players]);
                    System.out.println("Now player " + y + " chooses " + getEquivalent(playerList[y].getStrategy()) + " for the next round");
                } else System.out.println("Error setting next strategy in player " + y);

            }
        }
        System.out.println("Final results:  \n" + playerList[0].getName() + " > " + playerList[0].getScore() + "\n"
                + playerList[1].getName() + " > " + playerList[1].getScore());

    }

    private static int[] whoWins(int option1, int option2, int[] result){
        if(option1 != option2){
            switch(option1){
                case 1: {
                    if(option2 == 2) {
                        result[result.length - 1] = option2;
                        result[1] = result[1] + 1;
                        System.out.println("Player 1 wins");
                        System.out.println("Result 1 modified > " + result[1]);
                    } else {
                        result[0] = result[0] + 1;
                        result[result.length - 1] = option1;
                        System.out.println("Player 0 wins");
                        System.out.println("Result 0 modified > " + result[0]);
                    }
                    break;
                }
                case 2: {
                    if(option2 == 3) {
                        result[result.length - 1] = option2;
                        result[1] = result[1] + 1;
                        System.out.println("Player 1 wins");
                        System.out.println("Result 1 modified > " + result[1]);
                    } else {
                        result[0] = result[0] + 1;
                        result[result.length - 1] = option1;
                        System.out.println("Player 0 wins");
                        System.out.println("Result 0 modified > " + result[0]);
                    }
                    break;
                }
                case 3:{
                    if(option2 == 1) {
                        result[result.length - 1] = option2;
                        result[1] = result[1] + 1;
                        System.out.println("Player 1 wins");
                        System.out.println("Result 1 modified > " + result[1]);
                    } else {
                        result[0] = result[0] + 1;
                        result[result.length - 1] = option1;
                        System.out.println("Player 0 wins");
                        System.out.println("Result 0 modified > " + result[0]);
                    }
                    break;
                }
                default: {
                    result[result.length - 1] = option1;
                    System.out.println("Error evaluate options");
                    break;
                }
            }
        }
        else {
            System.out.println("Tie");
            result[result.length - 1] = option1;
        }
        return result;

    }
    private static String getEquivalent(int intOpt) {
        String nameOpt;
        switch (intOpt){
            case 1: nameOpt = "Rock"; break;
            case 2: nameOpt = "Paper"; break;
            case 3: nameOpt = "Scissors"; break;
            default: nameOpt = "Error in getEquivalent " + intOpt; break;
        }
        return nameOpt;
    }
}

