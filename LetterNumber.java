/* 
 * LetterNumber.java
 * @author mahl && mebs
 * @since october 2016
 * @version 1.0
 */

import java.util.Scanner;

public class LetterNumber {
    
    public static void main (String[] args) {

        System.out.println("Enter ONE input, letter or number > ");
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char c = input.charAt(0);
        if(input.length() > 1){
            System.out.println("You entered " + input.length() + " only the first one is considered");
        }
       switch (c) {
            default: {
                if(Character.isDigit(c)) {
                    System.out.println("Is a number");
                }
                else if (Character.isLetter(c)) {
                    System.out.println("Is a letter");
                }
                else {
                    System.out.println("Error");
                }
            }
	    } 
    }
}
        
