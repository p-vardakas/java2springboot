package humanity;

public class IntergalacticSystem {
    public static void main(String[] args) {
        Colony earth = new Colony("Earth", 12742, "Earth Mayor", 1000000);
        Colony moon = new Colony("Moon", 3474, "Moon Mayor", 10000);
        Colony mars = new Colony("Mars", 6779, "Mars Mayor", 100);

        ManMadeSatellite manMadeSatellite = new ManMadeSatellite(2020, "SpaceX",
                "CommunicationSatellite", "Communications");
        Debris debris = new Debris(123, "Metal");
        DefensiveWeapon defensiveWeapon = new DefensiveWeapon(2022, "Nasa", 1, true);
        SatellitePlanet satellitePlanet = new SatellitePlanet("mars");

        earth.createEarthquake(100, 300);
        earth.declareWar(mars);
        earth.makePeace(moon);
        earth.exploreTheUniverse();
        earth.launchSatellite(manMadeSatellite);

        defensiveWeapon.floatAroundParent(mars);
        defensiveWeapon.changeDistance(mars);
        defensiveWeapon.selfDestruct();
    }
}
