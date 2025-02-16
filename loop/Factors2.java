package loop;
import java.util.Scanner;

public class Factors2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cnt=0;
    
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                System.out.println(i);
                cnt++;
            }
        }
       System.out.println("Count:"+cnt);
        

        
        
    }
    
}
