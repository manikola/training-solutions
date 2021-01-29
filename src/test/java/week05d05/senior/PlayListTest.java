package week05d05.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayListTest {

    private List<Song> songList;
    private PlayList playlist;

    @BeforeEach
    public void setUp() {
        songList = new ArrayList<>();
        playlist = new PlayList(songList);

        Song song1 = new Song("Enter Sandman", 329, "Metallica");
        Song song2 = new Song("Fear Of The Dark", 442, "Iron Maiden");
        Song song3 = new Song("Origin", 228, "Korubaan");
        Song song4 = new Song("November Rain", 537, "Guns'n Roses");
        Song song5 = new Song("Summer Night City", 254, "Therion");

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);
        songList.add(song5);
    }

    @Test
    public void playlistToStringTest() {
        Assertions.assertEquals("[Metallica: Enter Sandman, hossza: 329 sec, Iron Maiden: Fear Of The Dark, hossza: 442 sec, " +
                "Korubaan: Origin, hossza: 228 sec, " +
                "Guns'n Roses: November Rain, hossza: 537 sec, Therion: Summer Night City, " +
                "hossza: 254 sec]", songList.toString());
    }

//    @Test
//    public void playlistSongsLongerThanTest() {
//        List<Song> s = playlist.findByLengthGreaterThan(7);
//        Assertions.assertEquals(2, s.size());
//    }
//
//    @Test
//    public void playlistSongsLongerThanTest2() {
//        List<Song> s = playlist.findByLengthGreaterThan(5);
//        Assertions.assertEquals(3, s.size());
//    }
}