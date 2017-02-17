/*
 * Main.java
 * @author mebs
 * @version 1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String pattern = "[a-zA-Z ]+";
        Student student = new Student();
        System.out.println(" ----- Student register! ----- ");
        System.out.println("Enter a name > ");
        while (!sc.hasNext(pattern)) {
            System.out.println("Name not valid, try again (avoid accents) > ");
            sc.next();
        }
        student.name = sc.next();
        System.out.println("Enter a surname > ");
        while (!sc.hasNext(pattern)) {
            System.out.println("Surname not valid, try again (avoid accents) > ");
            sc.next();
        }
        student.surname = sc.next();
        System.out.println("Let's start with marks. 1/5 Programming mark > ");
        try{
            student.programming = sc.nextDouble();
            while (student.programming < 0 || student.programming > 10) {
                System.out.println("Impossible or not valid, try again > ");
                student.programming = sc.nextDouble();
            }
            System.out.println("2/5 Calculus mark > ");
            student.calculus = sc.nextDouble();
            while (student.programming < 0 || student.programming > 10) {
                System.out.println("Impossible or not valid, try again > ");
                student.calculus = sc.nextDouble();
            }
            System.out.println("3/5 Physics mark > ");
            student.physics = sc.nextDouble();
            while (student.physics < 0 || student.physics > 10) {
                System.out.println("Impossible or not valid, try again > ");
                student.physics = sc.nextDouble();
            }
            System.out.println("4/5 Information mark > ");
            student.information = sc.nextDouble();
            while (student.information < 0 || student.information > 10) {
                System.out.println("Impossible or not valid, try again > ");
                student.information = sc.nextDouble();
            }
            System.out.println("5/5 Writing mark > ");
            student.writing = sc.nextDouble();
            while (student.writing < 0 || student.writing > 10) {
                System.out.println("Impossible or not valid, try again > ");
                student.writing = sc.nextDouble();
            }
            // Using the other constructor
            Student otherStudent = new Student("Elena", "Nito del Bosque", 8.9, 6.5, 9.0, 6.7, 5.0);
            System.out.println(" ----- Your marks: "+ student.name + " " + student.surname +" ----- \n" +
                    "Programming > " + student.programming + "\n" +
                    "Calculus > " + student.calculus + "\n" +
                    "Physics > " + student.physics + "\n" +
                    "Information > " + student.information + "\n" +
                    "Writing > " + student.writing);
            System.out.println("\n ----- Your marks: "+ otherStudent.name + " " + otherStudent.surname +" ----- \n" +
                    "Programming > " + otherStudent.programming + "\n" +
                    "Calculus > " + otherStudent.calculus + "\n" +
                    "Physics > " + otherStudent.physics + "\n" +
                    "Information > " + otherStudent.information + "\n" +
                    "Writing > " + otherStudent.writing);
        } catch (InputMismatchException e) {
            System.err.print("Seriously, a number...");
        }

    }
}
