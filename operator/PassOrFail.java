package operator;
import java.util.Scanner;
class PassOrFail{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        float per=(marks*100)/600;
        String pass=(per>=35)?((per<=100&&per>=75)?("A"):((per<75&& per>=60)?("B"):((per<60&&per>=35)?("C"):("Student is failed")))):("Student is Failed");
        System.out.println(pass);
        

    }
}