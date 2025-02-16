import java.util.Scanner;

public class Bmi {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        double weightInPounds=sc.nextFloat();
        double weightInKilograms=weightInPounds*0.45359237;

        double heightInInch=sc.nextFloat();
        double heightMeter=heightInInch*0.0254;

        double bmi=weightInKilograms/(heightMeter*heightMeter);
        System.out.println(bmi);
    }
   // 26.8573ans
}
