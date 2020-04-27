package functionalinterface;

/**
 * @author Nurcan Yilmaz
 */
public class MathProcess {

    public int addOne(Equation equation, int x, int y) {
        double result = equation.calculate(x, y) + 1;
        return (int) result;
    }

}
