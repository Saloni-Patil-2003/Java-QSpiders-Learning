package OOPs.Exception;

import Exception.AirthmaticException;

public class Exception1{
   public static void main(String[] args) {
    try{
        System.out.println(10/0);


    }
      catch(ArithmeticException e){
        System.out.println("Enter exception correct one");
    }
    catch(Exception e){
        System.out.println("enter correct");

    }
  
    finally{
        System.out.println("Finally block");
        
    }
    System.out.println("last statement");
   }
    
}
