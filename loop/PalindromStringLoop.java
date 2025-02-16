import java.util.Scanner;
public class PalindromStringLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String name2=name;
        String name1="";
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
            name1=name1+name.charAt(i);
            
        }
        if (name2.equals(name1)) {
            System.out.println(" String is palindrome");
            
        }
        else{
            System.out.println(" Not a Palindrome");
        }
        


    }
    
}
