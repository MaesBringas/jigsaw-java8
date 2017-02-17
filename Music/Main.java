/*
 * Main.java
 * @author mebs
 * @version 1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Album album1 = new Album();
        int albumSongsNum = 0;

        sc.useDelimiter(System.getProperty("line.separator"));

        //  After creating a Scanner, we question the user about the info of the Album.

        System.out.println("Hello user! Introduce the title of the Album: ");
        String albumName = sc.next();
        while(albumName.length()<2){
            System.out.println("Don't lie! > ");
            albumName = sc.next();
        }
        album1.setTitle(albumName);

        try {
            System.out.println("Now, introduce the year the Album was released: ");
            int albumYear = sc.nextInt();
            while(albumYear <= 0 || albumYear / 1000 < 1){
                System.out.println("Error: year not valid. Try again ");
                albumYear = sc.nextInt();
            }
            album1.setYear(albumYear);

            System.out.println("How many songs does the album have?: ");
            albumSongsNum = sc.nextInt();

//        album1.setSongs(albumSongs);
//        album1.setSongs(albumSongs);
        } catch (InputMismatchException e) {
        System.err.print("Do you know the difference between a number and a letter? ");
    }
        System.out.println("album song num " + albumSongsNum);
        Song[] albumSongs = new Song[albumSongsNum];

        System.out.println("What is the name of the first song?: ");
        String title = sc.next();
//        System.out.println(album1.getSongs(0).getTitle());
//        album1.getSongs()[0].setTitle(title);

//        albumSongs[0].setTitle(title);
        System.out.println("And how long is it, in seconds?: ");
        int duration = sc.nextInt();
//        albumSongs[0].setDuration(duration);

        albumSongs[0] = new Song(title, duration);

        for (int i = 1; i < albumSongs.length; i++) {
            System.out.println("What is the name of the next song?: ");
            String name = sc.next();
            albumSongs[i].setTitle(name);
            System.out.println("And how long is it, in seconds?: ");
            int seconds = sc.nextInt();
            albumSongs[i].setDuration(seconds);
            albumSongs[i] = new Song(name, seconds);
        }

        System.out.println("How much does the album cost?: ");
        int albumCost = sc.nextInt();
        album1.setPrice(albumCost);

        System.out.println("Is this album from a single author or band? Answer 'author' or 'band', without the '' :");
        String answer1 = sc.next();
        while(answer1.length()<2){
            System.out.println("Don't lie! > ");
            answer1 = sc.next();
        }
        Person[] authors = new Person[1];
        Band albumBand = new Band();

        if (answer1.equals("author")) {
            System.out.println("Introduce the name of the author: ");
            String name = sc.next();
//            authors[0].setName(name);

            System.out.println("Introduce the year that singer was born: ");
            int date = sc.nextInt();
//            authors[0].setBirthday(date);
            authors[0] = new Person(name, date);
        } else {

            System.out.println("Introduce the name of the band: ");
            String name = sc.next();
            albumBand.setName(name);

            System.out.println("Introduce the year that band was born: ");
            int year = sc.nextInt();
            albumBand.setYear(year);

            System.out.println("How many people are in the band?: ");
            int bandMembers = sc.nextInt();
            albumBand.setMembers(albumBand.members);
            albumBand.members = new Person[bandMembers];
            for (int i = 0; i < bandMembers; i++) {
                System.out.println("Introduce the name of a member of the band: ");
                String nameMember = sc.next();
//                albumBand.members[i].setName(nameMember);
                System.out.println("Introduce the year that singer was born: ");
                int date = sc.nextInt();
                albumBand.members[i] = new Person(name, date);
//                albumBand.members[i].setBirthday(date);
            }
        }

        if (answer1.equals("author")) {
            System.out.print("Album: ");
            System.out.println(album1.getTitle() + "(" + album1.getYear() + ")   " + album1.getPrice() + "$\n");
            System.out.print("By: ");
            for (int i = 0; i < album1.owner.length; i++)
                System.out.println(album1.owner[i].getName() + " (" + album1.owner[i].getBirthday() + ")\n");
            System.out.println("Songs: ");
            for (int i = 0; i < albumSongsNum; i++) {
                System.out.println(i + 1 + ". " + album1.songs[i].getTitle() + " (" + album1.songs[i].getDuration() + ")");
            }
        } else {
//            Album album1 = new Album(albumName, albumYear, albumSongs, albumCost, albumBand.members);

            System.out.print("Album: ");
            System.out.println("''" + album1.getTitle() + "''" + " (" + album1.getYear() + ")   " + album1.getPrice() + "$\n");
            System.out.print("By: ");
            for (int i = 0; i < album1.owner.length; i++)
                System.out.println(album1.owner[i].getName() + " (" + album1.owner[i].getBirthday() + ")\n");
            System.out.println("Songs: ");
            for (int i = 0; i < albumSongsNum; i++) {
                System.out.println(i + 1 + ". " + album1.songs[i].getTitle() + " (" + album1.songs[i].getDuration() + ") seconds.");
            }
        }


    }
}
