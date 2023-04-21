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
        for (Song song: songs) {
            ProxySong proxySong = (ProxySong) song;
            if (proxySong.getSongID() == songID) {
                return proxySong;
            }
        }
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
            ProxySong proxySong = (ProxySong) song;
            if (proxySong != null && proxySong.getTitle().contains(title)) {
                result.add(proxySong);
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
            ProxySong proxySong = (ProxySong) song;
            boolean IsAlbum = Objects.equals(proxySong.getAlbum().toLowerCase(), album.toLowerCase());
            if (proxySong != null && IsAlbum) {
                result.add(proxySong);
            }
        }
        return result;
    }
}
