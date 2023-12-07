package humanity;

public abstract class SpaceTech {
    private int yearOfCreation;
    private String companyName;

    public SpaceTech(int yearOfCreation, String companyName) {
        this.yearOfCreation = yearOfCreation;
        this.companyName = companyName;
    }

    abstract void selfDestruct();
}
