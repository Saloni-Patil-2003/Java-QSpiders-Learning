package Methods;
import java.util.Scanner;
public class currencyConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rupees=sc.nextInt();
        rupeesToDoller(rupees);

        
    }
    static void rupeesToDoller(int rupees){
        double dollar=rupees/87.47;
        System.out.println(dollar);
        dollarToEuro(dollar);

    }
    static void dollarToEuro(double dollar)
    {
        double euro=dollar*0.96;
        System.out.println(euro);
        euroToDhirum(euro);

    }
    static void euroToDhirum(double euro){
        double dhirum=euro*0.35;
        System.out.println(dhirum);
    }
    
}
