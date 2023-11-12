package casting_lesson_2;

public class CalculateEggs {
    public static void main(String[] args) {
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = 0;

        int dailyEggs = chickenCount * eggsPerChicken;
        totalEggs += dailyEggs;
        System.out.println("Monday: chickens: " + chickenCount + " eggs: " + totalEggs);

        chickenCount += 1;
        dailyEggs = chickenCount * eggsPerChicken;
        totalEggs += dailyEggs;
        System.out.println("Tuesday: chickens: " + chickenCount + " eggs: " + totalEggs);

        chickenCount = chickenCount / 2;
        dailyEggs = chickenCount * eggsPerChicken;
        totalEggs += dailyEggs;
        System.out.println("Wednesday: chickens: " + chickenCount + " eggs: " + totalEggs);
    }
}
