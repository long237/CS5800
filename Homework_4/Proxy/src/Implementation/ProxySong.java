package Implementation;

import Contracts.Song;

public class ProxySong implements Song {
    private RealSong realSong;
    private String title;
    private String album;
    private String artist;
    private int duration;

    public ProxySong (String title){
        this.title = title;
    }

    public ProxySong(String title, String album, String artist, int duration) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void play() {
        if (realSong == null) {
            realSong = new RealSong(title, album, artist, duration);
        }
        realSong.play();
    }
}
