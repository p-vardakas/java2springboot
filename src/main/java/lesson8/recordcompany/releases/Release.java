package lesson8.recordcompany.releases;

import lesson8.recordcompany.songs.Song;
import lesson8.recordcompany.artists.Artist;
import lesson8.recordcompany.exceptions.SongsLimitException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Release {
    private int id;
    private Artist artist;
    private String title;
    private Set<Song> songs;

    public Release(int id, Artist artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.songs = new HashSet<>();
    }

    public void printInfo() {
        System.out.println("Release id: " + id + ", title: " + title);
        System.out.println("Song List:");
        for (Song song : songs) {
            System.out.println("Artist: " + song.getArtist().getName() + ", title: " + song.getTitle());
        }
    }

    public abstract void addSong(Song song) throws SongsLimitException;

    public Set<Song> getSongs() {
        return this.songs;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Release release)) return false;

        if (id != release.id) return false;
        if (!Objects.equals(artist, release.artist)) return false;
        if (!Objects.equals(title, release.title)) return false;
        return Objects.equals(songs, release.songs);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (songs != null ? songs.hashCode() : 0);
        return result;
    }
}
