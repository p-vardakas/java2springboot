package humanity;

public class Debris implements Floatable{
    private int id;
    private String material;

    public Debris(int id, String material) {
        this.id = id;
        this.material = material;
    }

    @Override
    public void floatAroundParent(Planet planet) {
        System.out.println("Debris (ID: " + id + " Material: " + material + ") is floating around from its parent " +
                "planet: " + planet.getName() + ".");
    }

    @Override
    public void changeDistance(Planet planet) {
        System.out.println("Debris (ID: " + id + ") is changing its distance from from its parent planet: "
                + planet.getName() + ".");
    }
}
