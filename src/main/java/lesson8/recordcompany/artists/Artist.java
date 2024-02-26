package lesson8.recordcompany.artists;

public abstract class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist artist)) return false;

        return name.equals(artist.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
