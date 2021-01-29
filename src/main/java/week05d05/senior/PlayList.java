package week05d05.senior;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    List<Song> songs;

    public PlayList(List<Song> songs) {
        this.songs = new ArrayList(songs);
    }

    public List<Song> findByLengthGreaterThan(int mins) {
        List<Song> results = new ArrayList<>();
        double lengthInMins = (double)mins;
        for (Song item: songs){
            if((item.getLengthInSeconds() / 60D) > lengthInMins ){
                results.add(item);
            }
        }
        return results;
    }

    public String toString(List<Song> list) {
        String songListString = "";
        for (Song s : list) {
            songListString = songListString + s.toString() + "; ";
        }
        return songListString;
    }
}
