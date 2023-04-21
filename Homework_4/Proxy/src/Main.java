import Contracts.Song;
import Contracts.SongService;
import Implementation.ProxySong;
import Implementation.Spotify;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongService songService = new Spotify();

        // Initializes Spotify with Songs
        Song flowers = new ProxySong("Flowers", "Summer", "Miley Cyrus", 300, 1);
        Song partyInUSA = new ProxySong("Party In The USA", "Summer", "Miley Cyrus", 370, 2);
        Song wreckingBall = new ProxySong("Wrecking Ball", "Summer", "Miley Cyrus", 350, 3);

        Song stronger = new ProxySong("What doesn't kill you make you stronger", "Fall", "Kelly Clarkson", 350, 4);
        Song wantItThatWay = new ProxySong("I want it that way", "Fall", "Back Street Boys", 330, 5);
        Song callMeMaybe = new ProxySong("Call Me Baby", "Fall", "Carly Ray Jebson", 308, 6);

        Song thriller = new ProxySong("Thriller", "Spring", "Michael Jackson", 330, 7);
        Song beatIt = new ProxySong("Beat It", "Spring", "Michael Jackson", 330, 8);
        Song bad = new ProxySong("Bad", "Spring", "Michael Jackson", 330, 9);

        Song blankSpace = new ProxySong("Blank Space", "Winter", "Taylor Swift", 350, 10);
        Song romeoJuliet = new ProxySong("Romeo And Juliet", "Winter", "Taylor Swift", 420,11);
        Song shakeItOff = new ProxySong("ShakeItOff", "Winter", "Taylor Swift", 500,12);

        Song flowersSpencer = new ProxySong("Flowers", "Summer", "Lauren Spencer", 389, 13);

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
        spotify.addSong(flowersSpencer);

        // Search for Songs using Search by Album
        System.out.println("Songs by Album");
        List<Song> taylorSongs = songService.searchByAlbum("Winter");
        for (Song song : taylorSongs) {
            song.play();
        }

        // Songs by Titles
        System.out.println("");
        System.out.println("Songs by Titles");
        List<Song> songsByTitle = songService.searchByTitle("Flowers");
        for (Song song : songsByTitle) {
            song.play();
        }

        // Songs by ID
        System.out.println("");
        System.out.println("Songs by ID");
        Song songByID = songService.searchById(5);
        songByID.play();
        songByID = songService.searchById(7);
        songByID.play();
        songByID= songService.searchById(3);
        songByID.play();
    }
}