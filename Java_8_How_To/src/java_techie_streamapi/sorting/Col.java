package java_techie_streamapi.sorting;

import java_techie_streamapi.practical.filter_example.Employee;

import java.util.*;

public interface Col {

    List<String> LIST = Arrays.asList("AAA", "Bbb", "CcC", "DdDD", "eEEE");

    Map<Integer, String> MAP = new HashMap<>(){{
        put(1, "AAA");
        put(2, "Bbb");
        put(3, "CcC");
        put(4, "DdDD");
        put(5, "eEEE");
    }};

    List<Employee> EMPLOYEES = Arrays.asList(
        new Employee(176, "Roshan", "IT", 600000),
        new Employee(388, "Bikash", "CIVIL", 900000),
        new Employee(470, "Bimal", "DEFENCE", 500000),
        new Employee(624, "Sourav", "CORE", 400000),
        new Employee(176, "Prakash", "SOCIAL", 1200000));

    Map<String, Integer> MAP2 = new HashMap<>(){{
        put("eight", 8);
        put("four", 4);
        put("ten", 10);
        put("two", 2);
    }};

    Map<Employee, Integer> EMPLOYEES_MAP = new HashMap<>() {{
		put(new Employee(176, "Roshan", "IT", 600000), 60);
		put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
		put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
		put(new Employee(624, "Sourav", "CORE", 400000), 40);
		put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
    }};

    Map<Employee, Integer> SORTED_EMPLOYEES_MAP =
            new TreeMap<>((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())) {{
        put(new Employee(176, "Roshan", "IT", 600000), 60);
        put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        put(new Employee(624, "Sourav", "CORE", 400000), 40);
        put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);
    }};
}
