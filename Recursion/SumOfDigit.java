package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
       sumOfDigit(1234, 0);
    }
    static void sumOfDigit(int digit,int sum){
        if(digit!=0){
            sum+=digit%10;
            sumOfDigit(digit/10, sum);
            
        }
      else if(digit==0){
        System.out.println(sum);
      }
       
        // return digit==0?sum:sumOfDigit(digit/10, sum+=digit%10);
    }
    
}
