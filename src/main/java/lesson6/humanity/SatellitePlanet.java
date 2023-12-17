package lesson6.humanity;

public class SatellitePlanet implements Floatable {
    private String name;

    public SatellitePlanet(String name) {
        this.name = name;
    }

    @Override
    public void floatAroundParent(Planet planet) {
        System.out.println("Satellite Planet:" + name + "is floating around its parent planet " + planet.getName() + ".");
    }

    @Override
    public void changeDistance(Planet planet) {
        System.out.println(name + " is changing its distance from its parent planet: " + planet.getName() + ".");
    }
}
