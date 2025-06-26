package Methods;

public class NextPrime {
    public static void main(String[] args) {
        System.out.println(nextPrime(7));
      System.out.println(isPrime(7));
        
    }
    public static int nextPrime(int num){
       if(isPrime(num)){
        for(int start=num+1;;start++){
            if(isPrime(start)){
                return start;
            }
        }
       }
       else{
        for(int start=num;;start++){
            if(isPrime(start)){
                return start;
            }
        }
       }
    }
    public static boolean isPrime(int num){
        if(num<2)return false;
        int den=2;
        while(den<num){
            if(num%den==0){
                return false;
            }
            den++;
        }
        return true;
    }

  
}