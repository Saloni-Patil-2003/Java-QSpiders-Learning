package OOPs.Abstraction;

public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator c=new CalculatorImp();
        c.addition(10, 20);
        c.substraction(10, 30);
        c.division(40, 20);
        c.multiplication(10, 50);
        
    }
    
}
