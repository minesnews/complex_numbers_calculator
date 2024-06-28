package Calculator;

public class CalculatorComplex {
    private String complex = "i";

    public CalculatorComplex() {
        super();
    }

    public void calculatorComplexNumbers(String complex, char op, String complex2)
    {
        String result = "";
        if(complex == "i"){
            System.out.println("les");
        }
        if(
        complex2.toUpperCase().contains("i".toUpperCase())
        )
        {
            System.out.println("пока не поддерживается");
        }
        else{
             result = complex2 + complex;
        }
        System.out.println(result);
    }
}
