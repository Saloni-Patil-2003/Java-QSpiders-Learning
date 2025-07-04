package Recursion;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime1(9, 2));
    }
    static boolean isPrime1(int num,int den){
        if(num==den || num==1){
            return true;
        }
        else if(num%den==0){
            return false;
        }
      
        return isPrime1(num, ++den);
        

    }
    
}
