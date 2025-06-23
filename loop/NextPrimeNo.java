package loop;



public class NextPrimeNo {

    public static void main(String[] args) {
        System.out.println("Is Prime: " + prime(5));
        System.out.println("Next Prime: " + nextPrime(5));
        System.out.println("Sum of Digits: " + sumOfDigit(124));
        for(int i=1;i<=300;i++){
            if(isSmith(i)){
                System.out.println(i);
            }
        }
        
    }
    public static boolean prime(int num){
        int den=2;
        while(num>den){
            if(num%den==0){
                return false;
            
            }
            den++;

        }
        return true;
    }
    public static int nextPrime(int num){
    
        if(prime(num)){
            for(int start=num+1; ;start++){
                if(prime(start)){
                    return start;
                }
            }
        }else{
            for(int start=num; ;start++){
                if (prime(start)) {
                    return start;
                    
                }
        }
           
   
    }
}


public static int sumOfDigit(int num){
    int sum=0;
    while (num!=0) {
        sum+=num%10;
        num/=10;
        
    }
    return sum;
}

public static boolean isSmith(int num){
    if (prime(num)) return false; // Smith number is composite

        int sumOfDigits = sumOfDigit(num);
        int sumOfFactors = 0;
        int temp = num;

        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0 && prime(i)) {
                sumOfFactors += sumOfDigit(i);
                temp /= i;
            }
        }
        return sumOfDigits == sumOfFactors;
}
}