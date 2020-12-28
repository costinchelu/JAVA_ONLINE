package udemy_sec8d_linkedLists.ChallengePersonal;

// Create a Song class having title and duration for a song.

public class Song {
    private String title;
    private int duration;

    public String getTitle() { return title; }
    public int getDuration() { return duration; }

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
