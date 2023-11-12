package casting_lesson_2;

public class Casting {
    public static void main(String[] args) {
        // Δηλώστε δύο μεταβλητές με διάφορους τύπους δεδομένων
        int integerNumber = 42;
        double doubleNumber = 123.456;

        // Casting από int σε double
        double doubleFromInt = integerNumber;
        System.out.println("lesson1.Casting: int σε double: " + doubleFromInt);

        // Casting από double σε int
        int intFromDouble = (int) doubleNumber;
        System.out.println("lesson1.Casting: double σε int: " + intFromDouble);

        // Casting μεταξύ σχετικών τύπων δεδομένων
        byte byteNumber = (byte) integerNumber; // lesson1.Casting από int σε byte
        System.out.println("lesson1.Casting από int σε byte: " + byteNumber);

        // Χειρισμός τυχόν απώλειας δεδομένων
        int truncatedInt = (int) doubleNumber; // lesson1.Casting από double σε int (δυνητική απώλεια δεδομένων)
        System.out.println("lesson1.Casting από double σε int (με απώλεια δεδομένων): " + truncatedInt);

        // Δείξτε την απώλεια ακρίβειας
        float floatNumber = (float) doubleNumber; // lesson1.Casting από double σε float
        System.out.println("lesson1.Casting από double σε float (απώλεια ακρίβειας): " + floatNumber);
    }
}
