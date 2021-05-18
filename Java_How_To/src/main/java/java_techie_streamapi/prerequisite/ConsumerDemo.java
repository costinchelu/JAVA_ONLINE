package java_techie_streamapi.prerequisite;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


//    @Override
//    public void accept(Integer integer) {
//        System.out.println("Printing : " + integer);
//    }

    public static void main(String[] args) {

        Consumer<Integer> consume = integerArgument -> System.out.println("Printing : " + integerArgument);

        consume.accept(100);


        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        integerList.stream().forEach(consume);
        //integerList.forEach(consumer);

        integerList.forEach(integerArgument -> System.out.println("Printing : " + integerArgument));
    }
}
