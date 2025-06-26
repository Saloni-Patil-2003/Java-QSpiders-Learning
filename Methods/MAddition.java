package Methods;

public class MAddition {
    public static void main(String[] args) {
        System.out.println("Main Start");
      
       add('0', 127);
       devision(12.3, 120001002002.202000022);
       System.out.println("Main end");
    }

    static void add(int num1,int num2){
    System.out.println("Addition Start");
    int result=num1+num2;
    System.out.println(result);
    System.out.println("Addition Ends");
  
  
  }
  static void devision(double num1,double num2){
    System.out.println("Devision start");
    double result=num1/num2;
    System.out.println(result);
    System.out.println("Division ends");

  }
    
}
