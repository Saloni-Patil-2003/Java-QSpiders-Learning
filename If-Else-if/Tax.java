import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int salary=sc.nextInt();
    if(salary>=0 &&salary<=1200000){
        System.out.println("No Tax to Pay");

    } 
    else if(salary>1200000 && salary<=1600000){
        System.out.println("Your tax is:"+ (salary *0.15)+"Rupees");
    }   

    else if(salary>1600000 && salary<=2000000){
        System.out.println("Your tax is:"+ (salary *0.2)+"Rupees");
    } 
     
    else if(salary>2000000 && salary<=2400000){
        System.out.println("Your tax is:"+ (salary *0.25)+"Rupees");
    } 
else{
    System.out.println("Your tax is:"+ (salary *0.3)+"Rupees");

}
    
    }
    
}
