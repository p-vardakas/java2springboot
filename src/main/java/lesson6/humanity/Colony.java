package lesson6.humanity;

public class Colony extends Planet {
    private String mayorName;
    private int population;

    public Colony(String name, double diameter, String mayorName, int population) {
        super(name, diameter);
        this.mayorName = mayorName;
        this.population = population;
    }

    @Override
    public void rotateAroundYourself() {
        System.out.println(super.getName() + " is rotating around itself.");
    }

    @Override
    public void createEarthquake(int x, int y) {
        System.out.println("Creating Earthquake on " + super.getName() + " at coordinates (" + x + ", " + y + ").");
    }

    public void declareWar(Colony colony) {
        System.out.println(super.getName() + " declares war on " + colony.getName() + ".");
    }

    public void makePeace(Colony colony) {
        System.out.println(super.getName() + " makes peace with " + colony.getName() + ".");
    }

    public void exploreTheUniverse() {
        System.out.println(super.getName() + " is exploring the universe.");
    }

    public void launchSatellite(ManMadeSatellite satellite) {
        System.out.println("Launching a new satellite with purpose " + satellite.getPurpose() + " around "
                + super.getName() + ".");
    }
}
