import java.util.Scanner;
public class PoundsToKilograms {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number in pounds:");
        float pounds=sc.nextFloat();
        double kilogram=pounds*0.454;
        System.out.println(pounds+" pounds is "+kilogram+" kilograms");


    }
    
}
