package OOPs.Abstraction;

public abstract class Calculator {
    public abstract void addition(int n1,int n2);
    public abstract void substraction(int n1,int n2);
    public void multiplication(int n1,int n2){
        System.out.println(n1*n2);
        System.out.println("From Base Calculator");
    }
    public abstract void division(int den,int num);
    
}
