package week05d05.senior;

public class Song  {

    private String name;
    private long lengthInSeconds;
    private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (isEmpty(artist)) {
            throw new IllegalArgumentException("Artist cannot be empty");
        }
        this.name = name;
        if(lengthInSeconds <= 0){
            throw new IllegalArgumentException("Song must be longer, than zero");
        }
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().equals(""));
    }

    @Override
    public String toString() {
        return artist + ": " + name + ", hossza: " + lengthInSeconds + " sec";
    }
}
