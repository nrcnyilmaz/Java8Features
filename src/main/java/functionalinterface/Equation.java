package functionalinterface;

/**
 * @author Nurcan Yilmaz
 */

@FunctionalInterface
public interface Equation {
    double calculate(double x, double y);

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    default void defaultMethod2(String str) {
        System.out.println("This is a second default method. And parameter is: " + str);
    }
}
