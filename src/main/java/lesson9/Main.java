package lesson9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25, 50000, "HR",
                        Arrays.asList("Communication", "Teamwork")),
                new Employee("Bob", 32, 60000, "IT",
                        Arrays.asList("Java", "Python")),
                new Employee("Charlie", 28, 55000, "Finance",
                        Arrays.asList("Accounting", "Excel")),
                new Employee("David", 35, 70000, "IT",
                        Arrays.asList("JavaScript", "SQL")),
                new Employee("Eva", 45, 80000, "HR",
                        Arrays.asList("Leadership", "Negotiation")),
                new Employee("Frank", 40, 75000, "Finance",
                        Arrays.asList("Financial Analysis", "Budgeting")),
                new Employee("Grace", 29, 70000, "IT",
                        Arrays.asList("Java", "Python"))
        );

        List<Employee> youngerThanThirtyYears = employees.stream()
                .filter(employee -> employee.getAge() < 30)
                .toList();

        System.out.println("Employees that are below 30 years old:");
        youngerThanThirtyYears.forEach(employee -> System.out.println(employee.getName() + " "
                + employee.getAge()));

        List<Employee> employeesWithSalaryAbove60000 = employees.stream()
                .filter(employee -> employee.getSalary() > 60000L)
                .toList();

        System.out.println("Employees with salary above 60000 euro:");
        employeesWithSalaryAbove60000.forEach(employee -> System.out.println(employee.getName() + " "
                + employee.getSalary()));

        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .toList();

        System.out.println("Employee names:");
        employeeNames.forEach(System.out::println);

        List<String> uniqueDepartments = employees.stream()
                .map(employee -> employee.getDepartment().toLowerCase())
                .distinct()
                .toList();

        System.out.println("Unique departments:");
        uniqueDepartments.forEach(System.out::println);

        List<Double> uniqueSalaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .toList();

        System.out.println("Unique Salaries:");
        uniqueSalaries.forEach(System.out::println);

        Map<String, Double> employeeNameSalaryMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary));

        System.out.println("Employee name and salary:");
        employeeNameSalaryMap.forEach((name, salary) -> System.out.println(name + " " + salary));

        Employee employeeLowersSalary = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println("Employee with the lowest salary:");
        System.out.println(employeeLowersSalary.getName() + " " + employeeLowersSalary.getSalary());

        Employee employeeHighestSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println("Employee with the highest salary:");
        System.out.println(employeeHighestSalary.getName() + " " + employeeHighestSalary.getSalary());

        List<Employee> firstFourEmployees = employees.stream()
                .limit(4)
                .toList();

        System.out.println("First four employees:");
        firstFourEmployees.forEach(employee -> System.out.println(employee.getName()));

        List<Employee> employeesInRange30To40 = employees.stream()
                .filter(employee -> employee.getAge() >= 30)
                .filter(employee -> employee.getAge() <= 40)
                .toList();

        System.out.println("Employees in the age range of 30 to 40:");
        employeesInRange30To40.forEach(employee -> System.out.println(employee.getName() + " " + employee.getAge()));

        Optional<Employee> employeeOver50 = employees.stream()
                .filter(employee -> employee.getAge() > 50)
                .findFirst();

        System.out.println("Employee over 50 years old:");
        employeeOver50.ifPresent(System.out::println);

        List<Employee> employeesWithJavaSkills = employees.stream()
                .filter(employee -> employee.getSkills().contains("Java"))
                .toList();

        System.out.println("Employees with Java skills:");
        employeesWithJavaSkills.forEach(employee -> System.out.println(employee.getName()));

        List<Employee> highPaidPythonEmployees = employees.stream()
                .filter(employee -> employee.getSkills().contains("Python"))
                .filter(employee -> employee.getSalary() > 60000L)
                .toList();

        System.out.println("High paid employees with Python skills:");
        highPaidPythonEmployees.forEach(employee -> System.out.println(employee.getName()));

        Employee hrEmployee = employees.stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .findFirst()
                .get();

        System.out.println("HR Employee:");
        System.out.println(hrEmployee.getName());

        List<String> sortedSkills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Sorted skills:");
        sortedSkills.forEach(System.out::println);

        String uniqueSkills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println("Unique skills:");
        System.out.println(uniqueSkills);
    }
}
