package Recursion;

public class Count {
    public static void main(String[] args) {
       System.out.println(count(123445, 0));
    }
    public static int count(int num,int ct){
        /*if(num!=0){
             count(num/10, ++ct);
        }
        else if(num==0){
           System.out.println(ct);
        }
        */ 
        return num==0?ct:count(num/10, ++ct);
    }
    
}
