import java.util.Scanner;

public class PrintCharacter {
    public static void main(String[] args)throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.next().toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            Thread.sleep(1000);
        }
        

    }
    
}
