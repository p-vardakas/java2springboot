package humanity;

public class ManMadeSatellite extends SpaceTech implements Floatable{
    private String name;
    private String purpose;

    public ManMadeSatellite(int yearOfCreation, String companyName, String name, String purpose) {
        super(yearOfCreation, companyName);
        this.name = name;
        this.purpose = purpose;
    }


    public String getPurpose() {
        return purpose;
    }

    @Override
    public void floatAroundParent(Planet planet) {
        System.out.println(name + " is floating around its parent planet: " + planet.getName() + ".");
    }

    @Override
    public void changeDistance(Planet planet) {
        System.out.println(name + " is changing its distance from its parent planet: " + planet.getName() + ".");
    }

    public String printInfo() {
        return "ManMadeSatellite{" +
                "name='" + name + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }

    @Override
    void selfDestruct() {

    }
}
