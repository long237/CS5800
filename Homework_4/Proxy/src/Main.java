import Contracts.Song;
import Contracts.SongService;
import Implementation.ProxySong;
import Implementation.Spotify;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongService songService = new Spotify();

        // Initializes Spotify with Songs
        Song flowers = new ProxySong("Flowers", "Summer", "Miley Cyrus", 300);
        Song partyInUSA = new ProxySong("Party In The USA", "Summer", "Miley Cyrus", 370);
        Song wreckingBall = new ProxySong("Wrecking Ball", "Summer", "Miley Cyrus", 350);

        Song stronger = new ProxySong("What doesn't kill you make you stronger", "Fall", "Kelly Clarkson", 350);
        Song wantItThatWay = new ProxySong("I want it that way", "Fall", "Back Street Boys", 330);
        Song callMeMaybe = new ProxySong("Call Me Baby", "Fall", "Carly Ray Jebson", 308);

        Song thriller = new ProxySong("Thriller", "Spring", "Michael Jackson", 330);
        Song beatIt = new ProxySong("Beat It", "Spring", "Michael Jackson", 330);
        Song bad = new ProxySong("Bad", "Spring", "Michael Jackson", 330);

        Song blankSpace = new ProxySong("Blank Space", "Winter", "Taylor Swift", 350);
        Song romeoJuliet = new ProxySong("Romeo And Juliet", "Winter", "Taylor Swift", 420);
        Song shakeItOff = new ProxySong("ShakeItOff", "Winter", "Taylor Swift", 500);

        Spotify spotify = (Spotify) songService;
        spotify.addSong(flowers);
        spotify.addSong(partyInUSA);
        spotify.addSong(wreckingBall);
        spotify.addSong(stronger);
        spotify.addSong(wantItThatWay);
        spotify.addSong(callMeMaybe);
        spotify.addSong(thriller);
        spotify.addSong(beatIt);
        spotify.addSong(bad);
        spotify.addSong(blankSpace);
        spotify.addSong(romeoJuliet);
        spotify.addSong(shakeItOff);

        List<Song> taylorSongs = songService.searchByAlbum("Winter");
        for (Song song : taylorSongs) {
            song.play();
        }
    }
}