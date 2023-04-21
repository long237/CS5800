package Implementation;

import Contracts.Song;

public class ProxySong implements Song {
    private RealSong realSong;
    private String title;
    private String album;
    private String artist;
    private int duration;
    private int songID;

    public ProxySong (String title){
        this.title = title;
    }

    public ProxySong(String title, String album, String artist, int duration, int songID) {
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

    public int getSongID() {
        return songID;
    }

    @Override
    public void play() {
        if (realSong == null) {
            realSong = new RealSong(title, album, artist, duration, songID);
        }
        realSong.play();
    }
}
