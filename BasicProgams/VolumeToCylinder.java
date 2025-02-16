import java.util.Scanner;
public class VolumeToCylinder {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the radius and height of  a cylinder:");
      float r=sc.nextFloat();  
    float h=sc.nextInt();

      double area=3.14*r*r;
      double volume=area*h;
       System.out.println("The area is :"+area);
       System.out.println("The volume is:"+volume);

    }
    
}
