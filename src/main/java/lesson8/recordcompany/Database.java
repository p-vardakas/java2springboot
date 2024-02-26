package lesson8.recordcompany;

import lesson8.recordcompany.artists.Artist;
import lesson8.recordcompany.exceptions.ArtistExistException;
import lesson8.recordcompany.exceptions.ReleaseExistException;
import lesson8.recordcompany.exceptions.SongExistException;
import lesson8.recordcompany.releases.Release;
import lesson8.recordcompany.songs.Song;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Artist> artists;
    private List<Release> releases;
    private List<Song> songs;

    public Database() {
        artists = new ArrayList<>();
        releases = new ArrayList<>();
        songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) throws ArtistExistException {
        if (artists.contains(artist)) {
            throw new ArtistExistException("Artist: " + artist.getName() + " already exists");
        }
        artists.add(artist);
        System.out.println("Artist added successfully");
    }

    public Artist getArtistByName(String name) {
        for (Artist artist : artists) {
            if (artist.getName().equalsIgnoreCase(name)) {
                return artist;
            }
        }

        return null;
    }

    public void addRelease(Release release) throws ReleaseExistException {
        if (releases.contains(release)) {
            throw new ReleaseExistException("Release: " + release.getTitle() + " already exists");
        }
        releases.add(release);
        System.out.println("Release added successfully");
    }

    public Release getReleaseById(int id) {
        for (Release release : releases) {
            if (release.getId() == id) {
                return release;
            }
        }

        return null;
    }

    public List<Release> getReleasesByArtist(Artist artist) {
        List<Release> artistReleases = new ArrayList<>();
        for (Release release : releases) {
            if (release.getArtist().equals(artist)) {
                artistReleases.add(release);
            }
        }

        return artistReleases;
    }


    public void addSong(Song song) throws SongExistException {
        if (songs.contains(song)) {
            throw new SongExistException("Song: " + song.getTitle() + " already exists");
        }
        songs.add(song);
        System.out.println("Song added successfully");
    }

    public Song getSongByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }

        return null;
    }
}
