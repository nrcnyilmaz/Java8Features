package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * @author Nurcan Yilmaz
 */
public class FunctionExample {

    //take parameter and return a value
    public static class Person {
        private int id;
        private String name;
        private String surname;

        public Person(int id, String name,String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person(1, "John","Doe");
        Function<Person, String> personFunction = Person::getName;
        String result = personFunction.apply(person);

        System.out.println("Person name is: " + result);

        Function<Integer, Integer> add = (value) -> value + 10;
        Function<Integer, Integer> divide = (value) -> value / 5;

        Function<Integer, Integer> compose = add.compose(divide); //run add and it result pass divide

        Integer value = 20;

        System.out.println("(" + value + " / 5) + 10 = " + compose.apply(value));

        Function<Integer, Integer> andThen = add.andThen(divide); // opposite compose

        System.out.println("(" + value + " + 10) / 5 = " + andThen.apply(value));

        BiFunction<Integer, Integer, Integer> max = Math::max;
        Function<Integer, Integer> maxMultiply = (x) -> x * 3;

        System.out.println("Max value is : " + max.apply(3, 5));

        System.out.println("Max value * 3 : " + max.andThen(maxMultiply).apply(3, 5));

        IntFunction<String> intToStr = String::valueOf;
        System.out.println("Int To String -> " + intToStr.apply(5));

    }
}
