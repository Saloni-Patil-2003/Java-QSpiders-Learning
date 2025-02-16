package loop;
import java.util.Scanner;
public class EvenLengthLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    int count=0;
        int num2=num;
        int num1=0;
        int rem=0;
        for(;num>0;num/=10){
          rem =num%10;
            count++;
            num1=num1*10+rem;

        }
    
        System.out.println(num2);
        System.out.println(num1);
        System.out.println(count);
        if(count%2==0){
            if(num1%2==0){
                rem++;
                System.out.println(num1);
            }
            

        }
        
    }
    
}
