package humanity;

public abstract class Planet {
    private String name;
    private double diameter;

    public Planet(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void rotateAroundTheSun() {
        System.out.println(name + " is rotating around the sun");
    }

    public abstract void rotateAroundYourself();

    public abstract void createEarthquake(int x, int y);
}
