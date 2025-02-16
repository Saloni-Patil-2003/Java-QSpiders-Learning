import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        for(;num>0;num/=10) {
            int rem=num%10;
            rev=rev*10+rem;
            
        }
        System.out.print(rev);
       
        }
    }
