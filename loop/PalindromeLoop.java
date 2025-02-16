import java.util.Scanner;
public class PalindromeLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dup=num;
        int rev=0;
        for(;num>0;num/=10){
          int rem =+num%10;
          rev=rev*10+rem;
        }
        if(dup==rev){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
       
 
       

    }
    
}
