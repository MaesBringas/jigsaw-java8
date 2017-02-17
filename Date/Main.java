/*
 * Main.java
 * @author mebs
 * @version 1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        int day, month, year, maxDays;
        System.out.println("Enter a year > ");
        try{
            year = sc.nextInt();
            while(year <= 0 || year / 1000 < 1){
                System.out.println("Error: year not valid. Try again ");
                year = sc.nextInt();
            }
            System.out.println("Enter a month");
            month = sc.nextInt();
            while(month <= 0 || month - 12 > 1){
                System.out.println("Error: month not valid. Try again ");
                month = sc.nextInt();
            }
            maxDays = Date.daysMonth(month, year);
            System.out.println("Enter a day");
            day = sc.nextInt();
            while(day <= 0 || day > maxDays){
                System.err.println("Error: this day doesn't exists. Choose another lower than " + maxDays);
                day = sc.nextInt();
            }
            Date date = new Date(day, month, year);
            System.out.println(date.Dday + "/" + date.Dmonth+ "/" + date.Dyear);
        } catch (InputMismatchException e) {
            System.err.print("Do you know the difference between a number and a letter? ");
        }
    }


}

