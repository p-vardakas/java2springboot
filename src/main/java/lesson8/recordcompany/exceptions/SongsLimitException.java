package lesson8.recordcompany.exceptions;

public class SongsLimitException extends Exception {
    private int songLimit;

    public SongsLimitException(String message, int songLimit) {
        super(message);
        this.songLimit = songLimit;
    }
}
