package Methods;
public class GoodPrime {
   
    public static void main(String[] args) {
        for(int start=1;start<=100;start++)
        {
            if(isPrime(start)){
                System.out.println(start);
            }
        }
        
        
    }
    public static boolean isPrime(int num){
        int den=2;
     for(;den<num;den++){
        if(num%den==0){
            return false;
        }
     }
    
     if(num>2){
        for(int i=num;i>0;i/=10){
            int digit=i%10;
            int den2=2;
            for(;den2<digit;den2++){
               if(digit%den2==0){
                   return false;
               }
        }
        return true;

     }
     return true;
    
    }
    return true; 
}
}

    

