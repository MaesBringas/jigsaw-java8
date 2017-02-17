/*
 * Dni.java
 * @author mebs
 * @version 1.0
 */

import java.util.Scanner;

public class Dni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the DNI number and press Enter >> ");
        int dni = sc.nextInt();
        int value = dni%23;
        char[] letters = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("The Associate NIF is:" + dni + "-" + letters[value]);

    }
}
