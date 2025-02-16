package operator;
import java.util.Scanner;
public class Months {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String month=sc.nextLine();
        String state=(month=="oct"||month=="nov" ||month=="dec"|| month=="jan" )?("Winter"):((month=="feb"||month=="march" ||month=="apr"|| month=="may")?("Sammer"):((month=="jun"||month=="jul" ||month=="agu"|| month=="sap")?("mansun"):("")));
    System.out.println(state);
    }
    
}
