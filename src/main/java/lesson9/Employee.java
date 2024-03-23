package lesson9;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;
    private List<String> skills;

    public Employee(String name, int age, double salary, String department, List<String> skills) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getSkills() {
        return skills;
    }
}
