import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Celcius:");
        double cel=sc.nextDouble();
        double fahrenheit=9/5*cel+32;
        System.out.println(fahrenheit);

    }
    
}
