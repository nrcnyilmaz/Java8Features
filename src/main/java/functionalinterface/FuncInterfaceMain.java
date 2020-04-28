package functionalinterface;

/**
 * @author Nurcan Yilmaz
 */
public class FuncInterfaceMain {

    public static void main(String[] args) {

        // f(x,y) = x + y
        Equation equation = (x, y) -> x + y;
        double result = equation.calculate(3, 5);
        System.out.println("(x+y) function result is = " + result);

        // f(x,y) = (3*x + 2*y)/5
        Equation equation1 = (x, y) -> (3 * x + 2 * y) / 5;
        double calculate = equation1.calculate(11, 9);
        System.out.println("(3*x + 2*y)/5 function result is = " + calculate);

        // f(x,y) = sqrt(x-1) - y
        Equation equation2 = (x, y) -> Math.sqrt(x - 1) - y;
        double calculate2 = equation2.calculate(26, 8);
        System.out.println("(sqrt(x-1)) - y function result is = " + calculate2);

        MathProcess mathProcess = new MathProcess();
        int valueAddOne = mathProcess.addOne((x, y) -> x * y, 1, 2);
        System.out.println("(x*y) result added one: " + valueAddOne);


    }

}
