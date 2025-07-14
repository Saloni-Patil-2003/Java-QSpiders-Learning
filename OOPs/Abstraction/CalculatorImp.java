package OOPs.Abstraction;

public class CalculatorImp extends Calculator{
    public void addition(int n1,int n2){
        System.out.println(n1+n2);

    }
    public void substraction(int n1,int n2){
        System.out.println(n2-n1);
    }
    public void division(int den,int num){
        System.out.println(den/num);
    }
    public void multiplication(int n1,int n2){
        System.out.println(n1*n2);
        System.out.println("From child subclass multiplication");
    }
    public void message(){
        System.out.println("Message.........");
    }

    
}
