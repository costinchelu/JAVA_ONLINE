package udemy_sec8d_linkedLists.ChallengeTim;

public class Song {
    private String title;
    private double duration;

    public String getTitle() { return title; }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
