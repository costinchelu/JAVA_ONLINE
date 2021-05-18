package java_techie_streamapi.prerequisite;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

//    @Override
//    public boolean test(Integer integer) {
//        return (integer % 2 == 0);
//    }

    public static void main(String[] args) {

        Predicate<Integer> predicateExample = (integerArg) -> {return integerArg % 2 == 0;};
//        Predicate<Integer> predicateExample = (integerArg) -> integerArg % 2 == 0;

        System.out.println(predicateExample.test(7));
        System.out.println(predicateExample.test(8));


        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        integerList.stream()
                .filter(elementOfList -> elementOfList % 2 == 0)
                .forEach(filteredElement -> System.out.println("Filtered: " + filteredElement));
    }
}
