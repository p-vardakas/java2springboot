package lesson8.recordcompany;

import lesson8.recordcompany.artists.Artist;
import lesson8.recordcompany.artists.Band;
import lesson8.recordcompany.artists.SoloArtist;
import lesson8.recordcompany.exceptions.ArtistExistException;
import lesson8.recordcompany.exceptions.ReleaseExistException;
import lesson8.recordcompany.exceptions.SongExistException;
import lesson8.recordcompany.exceptions.SongsLimitException;
import lesson8.recordcompany.releases.Release;
import lesson8.recordcompany.releases.ReleaseCd;
import lesson8.recordcompany.releases.ReleaseMp3;
import lesson8.recordcompany.songs.Song;

import java.util.List;
import java.util.Scanner;

import static lesson8.recordcompany.Validator.getIntInput;

public class UserMenu {
    private Database database;

    public UserMenu(Database database) {
        this.database = database;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        int selection;
        do {
            String menuOptions = """
                    Available Options:
                     1. Add New Artist
                     2. Add New Release
                     3. Add New Song
                     4. Add Song To Release
                     5. Print Artist's Releases
                     6. Exit
                            
                    Please select 1 - 6:
                    """;
            selection = getIntInput(menuOptions, scanner);

            switch (selection) {
                case 1 -> addNewArtist(scanner);
                case 2 -> addNewRelease(scanner);
                case 3 -> addSong(scanner);
                case 4 -> addSongsToRelease(scanner);
                case 5 -> printArtistReleases(scanner);
                case 6 -> System.out.println("Exiting the application...");
                default -> System.out.println("Not Valid Input");
            }
        } while (selection != 6);
    }

    private void addNewArtist(Scanner scanner) {
        String artistOptions = """
                Please select the type of artist:
                 1. Solo Artist
                 2. Band
                Please select 1 - 2:
                """;

        int artistType;
        do {
            artistType = getIntInput(artistOptions, scanner);
        } while (artistType < 1 || artistType > 2);

        System.out.println("Enter the name of the artist:");
        String name = scanner.next();

        try {
            switch (artistType) {
                case 1 -> database.addArtist(new SoloArtist(name));
                case 2 -> database.addArtist(new Band(name));
            }
        } catch (ArtistExistException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addNewRelease(Scanner scanner) {
        String releaseOptions = """
                Please select the type of release:
                 1. CD
                 2. Mp3
                Please select 1 - 2:
                """;

        int releaseType;
        do {
            releaseType = getIntInput(releaseOptions, scanner);
        } while (releaseType < 1 || releaseType > 2);

        Artist artist = getArtist(scanner);

        int id = getIntInput("Enter the id of the release:", scanner);

        System.out.println("Enter the title of the release:");
        String title = scanner.next();

        try {
            switch (releaseType) {
                case 1 -> database.addRelease(new ReleaseCd(id, artist, title));
                case 2 -> database.addRelease(new ReleaseMp3(id, artist, title));
            }
        } catch (ReleaseExistException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addSong(Scanner scanner) {
        Artist artist = getArtist(scanner);

        System.out.println("Enter the title of the song:");
        String title = scanner.next();

        try {
            database.addSong(new Song(artist, title));
        } catch (SongExistException e) {
            System.out.println(e.getMessage());
        }
    }

    private Artist getArtist(Scanner scanner) {
        Artist artist;
        int retries = 0;
        int maxRetries = 2;
        do {
            System.out.println("Enter the name of the artist:");
            String name = scanner.next();
            artist = database.getArtistByName(name);
            retries++;

        } while (artist == null && retries < maxRetries);
        return artist;
    }

    private void addSongsToRelease(Scanner scanner) {
        Release release = getRelease(scanner);
        Song song = getSong(scanner);

        try {
            release.addSong(song);
        } catch (SongsLimitException e) {
            System.out.println(e.getMessage());
        }
    }

    private Release getRelease(Scanner scanner) {
        Release release;
        int retries = 0;
        int maxRetries = 2;
        do {
            int id = getIntInput("Enter the id of the release:", scanner);
            release = database.getReleaseById(id);
            retries++;
        } while (release == null && retries < maxRetries);
        return release;
    }

    private Song getSong(Scanner scanner) {
        Song song;
        int retries = 0;
        int maxRetries = 2;
        do {
            System.out.println("Enter the name of the song:");
            String title = scanner.next();
            song = database.getSongByTitle(title);
            retries++;
        } while (song == null && retries < maxRetries);
        return song;
    }

    private void printArtistReleases(Scanner scanner) {
        Artist artist = getArtist(scanner);
        List<Release> releases = database.getReleasesByArtist(artist);
        for (Release release : releases) {
            release.printInfo();
        }
    }
}
