/*
 * Player.java
 * @author mebs
 * @version 1.0
 */

import java.util.Random;

class Player {

    private String name;
    private int score, strategy;
    private boolean cyclic = false;
    private boolean copy = false;

    Player() {}

    void setName(String name) {
        this.name = name;
    }

    void setStrategy(int strategy) {

        this.strategy = strategy;
    }

    void setScore(int score) {
        this.score = score;
    }

    String getName() {
        return name;
    }

    int getStrategy() { return strategy; }

    int getScore() {
        return score;
    }

    // We don't create set for both booleans because the method setFirstStrategy changes the value once

    boolean getCyclic() { return cyclic; }
    boolean getCopy() { return copy; }

    int setFirstStrategy(int option) {
        Random r = new Random();
        int optionString;
        int winner = r.nextInt(4-1)+1;
        int i = r.nextInt(3-1)+1;
        switch (option){
            case 1: {
                optionString = r.nextInt(4-1)+1;
                System.out.println("Option chosen: " + optionString);
                break;
            }
            case 2: {
                optionString = i;
                cyclic = true;
                System.out.println("Option chosen: " + optionString);
                break;
            }
            case 3: {
                optionString = winner;
                copy = true;
                System.out.println("Option chosen: " + optionString);
                break;
            }
            default: optionString = r.nextInt(4-1)+1; break;
        }
        return optionString;
    }
}
