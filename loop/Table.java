package loop;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int range=sc.nextInt();
      
        for (int i = 1; i <=range; i++) {
            System.out.println(num+"X"+i+"="+(num*i));
            
        }
        

    }
    
}
