package Implementation;

import Contracts.Song;
import Contracts.SongService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Spotify implements SongService {
    private List<Song> songs;

    public Spotify() {
        this.songs = new ArrayList<Song>();
    }
    public Spotify(List<Song> songs) {
        this.songs = songs;
    }
    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void addSong (Song song) {
        songs.add(song);
    }

    @Override
    public Song searchById(int songID) {
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try{
            Thread.sleep(1000);
        }
        catch (Exception e) {}
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            RealSong realSong = (RealSong) song;
            if (realSong != null && realSong.getTitle().contains(title)) {
                result.add(realSong);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try{
            Thread.sleep(1000);
        }
        catch (Exception e) {}
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            //RealSong realSong = (RealSong) song;
            ProxySong realSong = (ProxySong) song;
            boolean IsAlbum = Objects.equals(realSong.getAlbum().toLowerCase(), album.toLowerCase());
            if (realSong != null && IsAlbum) {
                result.add(realSong);
            }
        }
        return result;
    }
}
