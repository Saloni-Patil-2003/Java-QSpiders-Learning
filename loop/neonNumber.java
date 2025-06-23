package loop;

import java.util.Scanner;

public class neonNumber {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int dup=num;
                int sqr=num*num;
                int sum=0;
                for(int i=sqr;i>0;i/=10){
                    int rem=i%10;
                     sum=sum+rem;

                 
                }
                System.out.println(sum);
                if(dup==sum){

                    System.out.println(num+"is nepn number");
                }

        
    }
    
}
