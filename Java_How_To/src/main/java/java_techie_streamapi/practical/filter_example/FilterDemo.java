package java_techie_streamapi.practical.filter_example;


import java_techie_streamapi.sorting.Col;

public class FilterDemo {

    public static void main(String[] args) {

        // conditional checking

        // traditional
        for(String s: Col.LIST) {
            if(s.startsWith("D") || s.startsWith("B")) {
                System.out.println(s);
            }
        }

        Col.LIST
                .stream()
                .filter(s -> s.startsWith("D") || s.startsWith("B"))
                .forEach(System.out::println);

        Col.MAP.
                entrySet()
                .stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(System.out::println);
    }
}
