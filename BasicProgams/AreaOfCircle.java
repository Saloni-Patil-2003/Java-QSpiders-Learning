import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p=22/7;
        System.out.println("Enter Radius:");
        int r=sc.nextInt();
        float area=p*r*r;
        float perimeter=2*p*r;

        
        System.out.println("Area of circle of radius:"+area);
        System.out.println("Perimeter of circle:"+perimeter);
    }
    
}
