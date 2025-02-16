package operator;
import java.util.Scanner;
public class Calculator {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Num1");
        int num1=sc.nextInt();
        System.out.println("Enter The Num1");
        int num2=sc.nextInt();
        System.out.println("Enter The Num1");
        char op=sc.next().charAt(0);

        float result=(op=='+')? num1+num2:
        (op=='-')? num1-num2:
        (op=='*')? num1*num2:
        (op=='/')?num1/num2:
        (op=='%')?num1%num2:0.0000f;//0.0000f for uniquness not generated any opertion after perform
       
         if(!(result==0.0000f)){
            System.out.println(""+num1+""+op+""+num2+"="+result);
         }
    
        
       

    }
    
}
