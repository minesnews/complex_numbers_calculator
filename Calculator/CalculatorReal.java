package Calculator;

import java.util.Scanner;

import View.CalculatorComplexView;

public class CalculatorReal {

    public void calculatorRealNumbers(int count, int a, char ch, int b)
    {
        CalculatorReal calculatorReal = new CalculatorReal();
        CalculatorComplexView view = new CalculatorComplexView();

        Scanner scanner = new Scanner(System.in);
            if (count == 0) {
                System.out.println("\n");
                System.out.println("Вид ввода: a +/-* b = c");
                System.out.println("\n");
                System.out.println("Введите число a: ");
                count++;
                a = scanner.nextInt();
                calculatorRealNumbers(count, a, ch, b);
            }
            else if (count == 1) {
                System.out.println("\n");
                System.out.println("Вид ввода: a +/-* b = c");
                System.out.println("\n");
                System.out.println("Введите символ ch: ");
                count++;
                ch = scanner.next().charAt(0);
                calculatorRealNumbers(count, a, ch, b);
            }
            else if (count == 2) {
                System.out.println("\n");
                System.out.println("Вид ввода: a +/-* b = c");
                System.out.println("\n");
                System.out.println("Введите число b: ");
                count++;
                b = scanner.nextInt();
                calculatorRealNumbers(count, a, ch, b);
            }
                System.out.println("\n");
                System.out.println("Результат");


            switch (ch) {                         
                case '+' -> {int sum = a+b; System.out.println(a + " + " + b + " = " + sum + "\n"); view.start();}           
                case '-' -> {int raz = a-b; System.out.println(a + " - " + b + " = " + raz + "\n");view.start();}              
                case '*' -> {int ymn = a*b; System.out.println(a + " * " + b + " = " + ymn + "\n");view.start();}          
                case '/' -> {double del = a/b; System.out.println(a + " / " + b + " = " + del + "\n");view.start();}                  
                default -> System.out.println("\nОперация не поддерживается");
            }
    }
}
