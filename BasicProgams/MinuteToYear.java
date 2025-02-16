import java.util.Scanner;
public class MinuteToYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int minute=sc.nextInt();
        int days=minute/1440;
        int year=minute/525600;
       
        System.out.println(minute+" minute is approximately year "+year+" And days "+days);

    }
    
}
