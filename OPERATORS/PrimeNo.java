package operator;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String prime=(num==2||num==3||num==5)?(num+"num is prime"):((num%2==0||num%3==0)?(num+"num is not prime"):(num+"num is prime"));
 System.out.println(prime);
    }
    
}
