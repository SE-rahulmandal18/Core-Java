package in.kgcoding.challenge114;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Rahul", 100),
                new Employee("Anshu", 1000),
                new Employee("Virat", 10000),
                new Employee("Rohit", 10),
                new Employee("Mohan", 50)
        );

        employees.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp2.getSalary(), emp1.getSalary()))
                .forEach(System.out::println);


//
//        String highestPaidEmployeeName =  employees.stream()
//                .sorted((emp1, emp2) -> Integer.compare(emp2.getSalary(), emp1.getSalary()))
//                .map(each -> each.getName())
//                .findFirst().orElse("No employee");
//        System.out.println(highestPaidEmployeeName);


        double maxSalary = employees.stream()
                .mapToDouble(Employee::getSalary) // Mapping to salary
                .max() // Find the max salary
                .orElse(0.0); // Default if no salary exists (empty list)

        // Print the highest salary
        System.out.println("The highest salary is: " + maxSalary);
    }
}
