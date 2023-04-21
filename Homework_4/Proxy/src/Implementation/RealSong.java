package Implementation;

import Contracts.Song;

public class RealSong implements Song {
    private String title;
    private String album;
    private String artist;
    private int duration;
    private int songID;

    public RealSong(String title, String album, String artist, int duration, int songID) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + title  + " by: " + artist);
    }
}
