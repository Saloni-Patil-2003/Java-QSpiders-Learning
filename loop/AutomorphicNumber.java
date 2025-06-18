package loop;
import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int len=0;
        int dev=1;
        for(int i=num;i>0;i/=10){
            len++;
        }
        for(int i=1;i<=len;i++){
             dev *=10;
        }
        if(num==(num*num)%dev){
            System.out.println(num+" Is Automatic Number");
        }
        else{
            System.out.println(num+" is not Automatic Number");
        }
        
    }
    
}
