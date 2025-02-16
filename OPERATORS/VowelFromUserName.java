package operator;
import java.util.Scanner;
public class VowelFromUserName {
    public static void main(String[] args) {
        System.out.println("Enter Your Name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next().toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U'){
                System.out.println(name.charAt(i));
            }
            
            
        }

    }
    
}
