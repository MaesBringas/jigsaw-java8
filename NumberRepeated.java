/*
 * NumberRepeated.java
 * @author mebs
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class NumberRepeated {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        List<Integer> results = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i<arr.length;i++){
            arr[i]=rand.nextInt((10-1) +1) + 1;
            System.out.println(arr[i]);
        }

        System.out.println("Enter a number > ");
        int request = sc.nextInt();

        for(int i = 0; i<arr.length;i++){
            if(arr[i]==request){
                results.add(i);
                System.out.println("It's in the array position > " + i);
            }
        }
        System.out.println("The number was found " + results.size() + " times.");

    }

}
