package java_techie_streamapi.sorting;

import java_techie_streamapi.practical.filter_example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SortListMapDemo {

    public static void main(String[] args) {

        System.out.println("-----------List sorting");
        Collections.sort(Col.LIST);
        Collections.reverse(Col.LIST);

        Col.LIST
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // traditional:
        // Col.EMPLOYEES.sort((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary()));

        // stream way
        Col.EMPLOYEES
                .stream()
                .sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .forEach(System.out::println);

        Col.EMPLOYEES
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("-----------Map sorting");
        /* traditional
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(Col.MAP2.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        */

        // stream way
        Col.MAP2.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // original Map remains unsorted (Hashmap)
        for (Map.Entry<String, Integer> e : Col.MAP2.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // sorting into a new map (needs to be a LinkedHashMap)
        Map<String, Integer> sortedMap =
                Col.MAP2.entrySet()
                        .stream().
                        sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        // new hashmap will be sorted
        for (Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println("mmm key: " + e.getKey() + " | mmm value: " + e.getValue());
        }

        // using Employee map
        Col.EMPLOYEES_MAP.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);
    }
}
