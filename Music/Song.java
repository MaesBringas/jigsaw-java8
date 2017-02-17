/*
 * Song.java
 * @author mebs
 * @version 1.0
 */

class Song {
    private String title;
    private int duration;

    Song(String title, int duration) {
        this.title = title;
        if (duration > 0)
            this.duration = duration;
        else
            this.duration = 0;
    }
    Song(){}

    void setTitle(String title) {
        this.title = title;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    String getTitle() {
        return this.title;
    }

    int getDuration() {
        return this.duration;
    }


}
