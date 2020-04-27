package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

/**
 * @author Nurcan Yilmaz
 */
public class ConsumerExample {

    //Consumer Functional Interface just consume the function and return nothing
    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase(Locale.ENGLISH));
        consumer.accept("this is a test");

        Consumer<String> consumer1 = str-> System.out.println(str + " :)");
        consumer.andThen(consumer1).accept("java 8");


        List<String> list = Arrays.asList("GREEN","RED","BLUE");
        list.forEach(System.out::println);

    }
}
