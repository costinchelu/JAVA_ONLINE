package java_techie_streamapi.practical.map_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapReduceDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        // traditional summing
        int sum = 0;
        for (int no : numbers) {
            sum += no;
        }
        System.out.println(sum);


        // summing in Java 8
        int streamSum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(streamSum);

        // reduce method (aggregate function)
        Integer reduceSum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(reduceSum);

        Integer s = numbers.stream().reduce(Integer::sum).orElse(0);

        // finding longest string in a list:
        List<String> strings = Arrays.asList("Core Java", "Spring", "Hibernate");
        String longestString = strings.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        // get Employees whose grade is a
        double averageSalaryOfGradeAEmployees = EmployeeDatabase.getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(averageSalaryOfGradeAEmployees);

    }
}
