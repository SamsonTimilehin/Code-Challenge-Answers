package Lambda;

public class CalculatorImpl implements Calculator{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return Calculator.super.subtract(a, b);
    }

    public static void main(String[] args) {

        CalculatorImpl calculator = new CalculatorImpl();

        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(5, 3);
        System.out.println("Difference: " + difference);
    }
}
