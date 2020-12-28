package udemy_sec8d_linkedLists.ChallengePersonal;

import java.util.LinkedList;

public class Playlist {
    private String playlistTitle;
    private LinkedList<Song> playlist;

    public String getPlaylistTitle() { return playlistTitle; }
    public LinkedList<Song> getPlaylist() { return playlist; }

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
        this.playlist = new LinkedList<Song>();
    }
}
