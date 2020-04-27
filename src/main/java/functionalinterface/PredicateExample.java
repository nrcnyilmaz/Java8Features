package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * @author Nurcan Yilmaz
 */
public class PredicateExample {

    // Predicate Functional Interface check a condition and return boolen result

    public static void main(String[] args) {

        Predicate<String> predicate = (s -> s.contains("A"));

        boolean helloResult = predicate.test(   "HELLO");
        System.out.println("HELLO contains 'A' is " + helloResult);

        boolean predicateResult = predicate.test("PREDICATE");
        System.out.println("PREDICATE contains 'A' is " + predicateResult);

        Predicate<Integer> integerPredicate = (i) -> i > 20;
        System.out.println("40 is greater than 20 -> " + integerPredicate.test(40));

        Predicate<Integer> integerPredicate2 = (i) -> i < 100;

        // 40 is bigger than 20 and result true
        // 40 is smaller than 100 and result true
        // true and true -> result is true
        boolean result = integerPredicate.and(integerPredicate2).test(40);
        System.out.println("40 is between 20 and 100 -> " + result);

        boolean result2 = integerPredicate.and(integerPredicate2).test(110);
        System.out.println("110 is between 20 and 100 -> " + result2);


        boolean result3 = integerPredicate.negate().test(110);
        System.out.println("!(110 is greater than 20) -> " + result3);

        //or ||
        IntPredicate intPredicate = (i) -> i % 2 == 0;
        IntPredicate intPredicate1 = (i) -> i % 3 == 0;
        boolean test = intPredicate.or(intPredicate1).test(11);
        System.out.println("11 can divided by 2 || 11 can divided by 3 -> " + test);


        // remove in list if item > 20
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeIf(integerPredicate);

        list.forEach(System.out::println);


    }

}
