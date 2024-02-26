package lesson8.recordcompany.songs;

import lesson8.recordcompany.artists.Artist;

public class Song {
    private Artist artist;
    private String title;

    public Song(Artist artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;

        if (!artist.equals(song.artist)) return false;
        return title.equals(song.title);
    }

    @Override
    public int hashCode() {
        int result = artist.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }
}
