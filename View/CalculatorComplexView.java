package View;

import java.util.Scanner;

import Calculator.CalculatorReal;
import Calculator.CalculatorComplex;

public class CalculatorComplexView {
    public void start(){
        CalculatorReal real = new CalculatorReal();
        CalculatorComplex complex = new CalculatorComplex();
        Scanner scanner = new Scanner(System.in);
        int count = 0;// счетчик
        int a = 0;
        int b = 0;
        char ch = '0';
        while (true) {
            System.out.println("1 - калькулятор действительных чисел");
            System.out.println("2 - калькулятор комплексных чисел");
            System.out.println("3 - выход");
            
            switch (scanner.nextInt()) {                
                case 1 -> real.calculatorRealNumbers(count, a, ch, b);// выход из приложения            
                case 2 -> complex.calculatorComplexNumbers("i", '+', "2");// выход из приложения            
                case 3 -> System.exit(0);// выход из приложения            
                default -> System.out.println("Операция не поддерживается");
            }
            
        }
        

    }
    
    
}
