/*
 * Main.java
 * @author mebs
 * @version 1.0
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String pattern = "[a-zA-Z ]+";
        FootballPlayer player1 = new FootballPlayer();
        System.out.println(" ----- Player creator assistant! ----- ");
        System.out.println("Enter a name > ");
        while (!sc.hasNext(pattern)) {
            System.out.println("Name not valid, try again > ");
            sc.next();
        }
        player1.name = sc.next();
        System.out.println("Enter a surname > ");
        while (!sc.hasNext(pattern)) {
            System.out.println("Surname not valid, try again > ");
            sc.next();
        }
        player1.surname = sc.next();
        System.out.println("How old is he? > ");
        while (!sc.hasNextInt()) {
            System.out.println("Age not valid, try again > ");
            sc.nextInt();
        }
        player1.age = sc.nextInt();
        System.out.println("In what position does he play? > ");
        while (!sc.hasNext(pattern)) {
            System.out.println("Position not valid, try again > ");
            sc.next();
        }
        player1.position = sc.next();
        System.out.println("And finally? In what team does he play? > ");
        while (!sc.hasNext(pattern)) {
            System.out.println("Team not valid, try again > ");
            sc.next();
        }
        player1.team = sc.next();

        System.out.println(" ----- Player created successfully ----- \n" +
                "Name > " + player1.name + "\n" +
                "Surname > " + player1.surname + "\n" +
                "Age > " + player1.age + "\n" +
                "Position > " + player1.position + "\n" +
                "Team > " + player1.team);
    }
}
