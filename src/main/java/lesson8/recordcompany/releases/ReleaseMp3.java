package lesson8.recordcompany.releases;

import lesson8.recordcompany.songs.Song;
import lesson8.recordcompany.exceptions.SongsLimitException;
import lesson8.recordcompany.artists.Artist;

public class ReleaseMp3 extends Release {
    private static final int SONG_LIMIT = 1;

    public ReleaseMp3(int id, Artist artist, String title) {
        super(id, artist, title);
    }

    @Override
    public void addSong(Song song) throws SongsLimitException {
        if (this.getSongs().isEmpty()) {
            this.getSongs().add(song);
        } else {
            throw new SongsLimitException("Error on release: " + this.getTitle()
                    + ", exceeds the allowed limit of songs", SONG_LIMIT);
        }
    }
}
