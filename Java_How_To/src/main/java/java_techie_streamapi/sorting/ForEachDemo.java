package java_techie_streamapi.sorting;


public class ForEachDemo {

    public static void main(String[] args) {

        // traditional:
        for(String s : Col.LIST) {
            System.out.println(s);
        }

        // with streams API
//        list.stream().forEach(elem -> System.out.println(elem));
        Col.LIST.forEach(System.out::println);

        Col.MAP.forEach((key, value) -> System.out.println(key + "    " + value));

        Col.MAP.entrySet().forEach(System.out::println);
    }
}
