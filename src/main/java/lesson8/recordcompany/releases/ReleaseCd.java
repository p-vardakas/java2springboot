package lesson8.recordcompany.releases;

import lesson8.recordcompany.songs.Song;
import lesson8.recordcompany.exceptions.SongsLimitException;
import lesson8.recordcompany.artists.Artist;

public class ReleaseCd extends Release {
    private static final int SONG_LIMIT = 5;

    public ReleaseCd(int id, Artist artist, String title) {
        super(id, artist, title);
    }

    @Override
    public void addSong(Song song) throws SongsLimitException {
        if (this.getSongs().size() < SONG_LIMIT) {
            this.getSongs().add(song);
            System.out.println("Song added successfully");
        } else {
            throw new SongsLimitException("Error on release: " + this.getTitle()
                    + ", exceeds the allowed limit of songs", SONG_LIMIT);
        }
    }
}
