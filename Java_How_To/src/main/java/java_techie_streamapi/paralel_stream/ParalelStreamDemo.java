package java_techie_streamapi.paralel_stream;

import java_techie_streamapi.practical.map_example.Employee;
import java_techie_streamapi.practical.map_example.EmployeeDatabase;

import java.util.List;
import java.util.stream.IntStream;

public class ParalelStreamDemo {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;

//        start = System.currentTimeMillis();
//        IntStream.range(1, 1000000).average();
//        end = System.currentTimeMillis();
//        System.out.println("Time taken (single core): " + (end - start));
//
//        start = System.currentTimeMillis();
//        IntStream.range(1, 1000000).parallel().average();
//        end = System.currentTimeMillis();
//        System.out.println("Time taken (parallel): " + (end - start));

        List<Employee> employees = EmployeeDatabase.getManyEmployees();

        // normal stream
        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream().
                map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Time taken (single core): " + (end - start));
        System.out.println(salaryWithStream);

        // parallel stream
        start = System.currentTimeMillis();
        double salaryWithParallel = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Time taken (parallel): " + (end - start));
        System.out.println(salaryWithParallel);
    }
}
