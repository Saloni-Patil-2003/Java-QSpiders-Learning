package loop;
import java.util.Scanner;

public class Factors3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cnt=0;
    
        for (int i = 2; i <num; i++) {
            if(num%i==0){
                System.out.println(i);
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println(num+" isPrime");
        }
        else{
            System.out.println(num+" Is not prime");
        }
       System.out.println("Count:"+cnt);
        

        
        
    }
    
}
