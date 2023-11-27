package students;

import java.util.Scanner;

public class Management {
    private Student[] students;

    public Management() {
        this.students = new Student[2];
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            String menuOptions = """
            Available Options:
             1. Add New Student
             2. Update Student Grade
             3. Remove a Student
             4. Display Students
             5. Exit
                    
            Please select 1 - 5:
            """;

            System.out.println(menuOptions);

            selection = scanner.nextInt();

            switch (selection) {
                case 1 -> System.out.println(addStudents(scanner));
                case 2 -> System.out.println(updateGrade(scanner));
                case 3 -> System.out.println(removingStudent(scanner));
                case 4 -> System.out.println(displayStudents());
                case 5 -> System.out.println("Exiting the application...");
                default -> System.out.println("Please select 1 - 5");
            }
        } while (selection != 5);
    }

    private String addStudents(Scanner scanner) {
        int id = getId(scanner);

        System.out.println("Provide name for student");
        String name = scanner.next();

        System.out.println("Adding student...");

        Student student = getStudent(id);

        if (student != null) {
            return "Student already exists";
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(id, name);
                return "Student added successfully";
            }
        }
        return "database is full";
    }

    private String updateGrade(Scanner scanner) {
        int id = getId(scanner);

        Student student = getStudent(id);

        if (student != null) {
            int grade;
            do {
                System.out.println("Provide grade for student");
                grade = scanner.nextInt();
            } while (grade > 10);

            System.out.println("Adding grade student...");
            student.setGrade(grade);
            return "Student's grade added successfully";
        }

        return "Student id not found";
    }

    private Student getStudent(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private String removingStudent(Scanner scanner) {
        int id = getId(scanner);

        System.out.println("Removing student...");

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                return "Student removed successfully";
            }
        }
        return "Student id not found";
    }

    private static int getId(Scanner scanner) {
        System.out.println("Provide id for student");
        return scanner.nextInt();
    }

    private String displayStudents() {
        System.out.println("Searching for available students...");

        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : students) {
            if (student != null) {
                stringBuilder.append("id: " + student.getId() + " name: " + student.getName()
                        + " grade: " + student.getGrade());
                stringBuilder.append("\n");
            }
        }

        if (stringBuilder.isEmpty()) {
            stringBuilder.append("There aren't any available students");
        }
        return stringBuilder.toString();
    }
}
