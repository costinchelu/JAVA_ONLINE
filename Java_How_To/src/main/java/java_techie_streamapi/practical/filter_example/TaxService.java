package java_techie_streamapi.practical.filter_example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {

        return input.equalsIgnoreCase("tax")
            ? EmployeeDatabase.getEmployees()
                    .stream()
                    .filter(employee -> employee.getSalary() > 500000)
                    .collect(Collectors.toList())
            : EmployeeDatabase.getEmployees()
                    .stream()
                    .filter(emp -> emp.getSalary() <= 500000)
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("no-tax"));
    }
}
