package lesson6.humanity;

public class DefensiveWeapon extends SpaceTech implements Floatable{
    private int weaponId;
    private boolean isNuclear;

    public DefensiveWeapon(int yearOfCreation, String companyName, int weaponId, boolean isNuclear) {
        super(yearOfCreation, companyName);
        this.weaponId = weaponId;
        this.isNuclear = isNuclear;
    }

    @Override
    public void floatAroundParent(Planet planet) {
        System.out.println("Defensive Weapon (ID: " + weaponId + ") is floating around ifrom its parent planet: "
                + planet.getName() + ".");
    }

    @Override
    public void changeDistance(Planet planet) {
        System.out.println("Defensive Weapon (ID: " + weaponId + ") is changing its distance from its parent planet: "
                + planet.getName() + ".");
    }

    @Override
    public void selfDestruct() {
        if (isNuclear) {
            System.out.println("Defensive Weapon (ID: " + weaponId + ") is not self-destructing.");
        } else {
            System.out.println("Defensive Weapon (ID: " + weaponId + ") is self-destructing.");
        }
    }
}
