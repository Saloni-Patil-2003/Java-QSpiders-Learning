package operator;
import java.util.Scanner;
public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();


       String div= ((a%2==0 && a%5==0)?("HiTwoHiFive"):(((a%2==0))?("HiTwo"):((a%5==0)?("HiFive"):(" "))));
    
       System.out.println(div);

        
    }
    
}
