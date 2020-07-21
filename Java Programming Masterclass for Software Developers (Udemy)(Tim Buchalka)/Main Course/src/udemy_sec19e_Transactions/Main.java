package udemy_sec19e_Transactions;

import udemy_sec19e_Transactions.Model.Artist;
import udemy_sec19e_Transactions.Model.Datasource;
import udemy_sec19e_Transactions.Model.SongArtist;


public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

//        datasource.insertSong("Touch of Grey", "Grateful Dead", "In the Dark", 1);
//        datasource.insertSong("Until My Last Breath", "Tarja Turunen", "What Lies Beneath", 2);


        datasource.close();
    }
}
