import Calculator.CalculatorReal;
import Service.Operators;
import View.CalculatorComplexView;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Калькулятор комплексных чисел-------------------------");

        //ComplexNumber a = new ComplexNumber(1, 2);
        CalculatorComplexView calculatorComplexView = new CalculatorComplexView();

        calculatorComplexView.start();

        // CalculatorReal real = new CalculatorReal();

        // real.operators();

        // Operators operators = new Operators();
        // System.out.println(operators.getOperators());

        System.out.println("-------------------------------------------------------------------------------");
    }
}
