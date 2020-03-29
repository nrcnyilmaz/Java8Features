package optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalExamples {

    public static void main(String[] args) {
        System.out.println("-- OPTIONAL DEMO --");

        Optional<Integer> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());

        Optional<Integer> integerOptional1 = Optional.of(3);
        System.out.println(integerOptional1.isPresent());

        //get
        Optional<String> stringOptional2 = Optional.ofNullable("Test");
        System.out.println(stringOptional2.get());

        //orElse
        Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional.orElse("Default Value"));

        //ifPresent
        Optional<String> stringOptional1 = Optional.ofNullable("Hello World");
        stringOptional1.ifPresent(System.out::println);

        //orElseGet
        Optional<String> stringOptional3 = Optional.ofNullable(null);
        System.out.println(stringOptional3.orElseGet(() -> "There is no value"));

        //orElseThrow
        Optional<String> stringOptional4 = Optional.ofNullable(null);
        //stringOptional4.orElseThrow(RuntimeException::new);

        //map
        Optional<Integer> integerOptional = Optional.of(3);
        System.out.println(integerOptional.map(i -> i * 2));
        integerOptional.map(i -> i * 2).ifPresent(System.out::println);

        //filter
        Optional<String> stringOptional5 = Optional.ofNullable("Hello World");
        stringOptional5.filter(str -> str.contains("x")).ifPresent(System.out::println);

        Optional<Integer> optional = Optional.of(25);
        optional.map(i -> i * 2).filter(i -> i.equals(50)).ifPresent(System.out::println);

        //flatmap

        Function<String, Optional<String>> upperCaseFunction = s -> Optional.of(s.toUpperCase());

        Optional<String> word = Optional.of("optionalTest");

        Optional<Optional<String>> optionalMap = word.map(upperCaseFunction);
        Optional<String> optionalFlatMap = word.flatMap(upperCaseFunction);

        optionalMap.ifPresent(System.out::println);
        optionalFlatMap.ifPresent(System.out::println);


    }
}
