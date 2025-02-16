package operator;
import java.util.Scanner;
public class UpperCase {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);

     String chara=((ch>='A'&&ch<='Z' || ch>='a'&& ch<='z'))?((ch>='A'&&ch<'Z')?(ch+" PPERCHASE "):ch+(" Lowercase")):((ch>='0'&&ch<='9')?(ch+"is Digit"):(ch+"is special character"));
        System.out.println(chara);
        
    }
    
}
