package loop;

import java.util.Scanner;

class BuzzNo {
    public static void main(String []args){
        int num=new Scanner(System.in).nextInt();
        if(num%7==0 ||num%10==7){
            System.out.println(num+" Is Buzz NUmber");
        }
        else  {
            System.out.println(num+" Is not Buzz Number");
            
        }


    }
    
}
