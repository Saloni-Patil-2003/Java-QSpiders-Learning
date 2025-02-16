import java.util.Scanner;
public class VowelConsnent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
         String vowel=(ch=='a'||ch=='e'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+ " is vowel"):(ch+" is consol");
   System.out.println("character is:" +vowel);
        
    }
    
}
