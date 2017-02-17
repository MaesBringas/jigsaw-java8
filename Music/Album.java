/*
 * Album.java
 * @author mebs
 * @version 1.0
 */

public class Album {
    private String title;
    private int year;
    Song[] songs;
    private float price;
    Person[] owner;

    Album(String title, int year, Song[] songs, float price, Person[] owner) {
        this.title = title;
        this.year = year;
        this.songs = songs;
        this.price = price;
        this.owner = owner;
        if (price > 0)
            this.price = price;
        else
            this.price = 0;

    }

    Album() {

    }

    void setTitle(String title) {
        this.title = title;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setSongs(Song[] songs) {
        this.songs = songs;
    }

    void setPrice(float price) {
        this.price = price;
    }

    void setOwner(Person[] owner) {
        this.owner = owner;
    }

    String getTitle() {
        return this.title;
    }

    int getYear() {
        return this.year;
    }

    Song getSongs(int i) {
        return this.songs[i];
    }

    float getPrice() {
        return this.price;
    }

    Person[] getOwner() {
        return this.owner;
    }
}
