package loop;

public class SpyNo {
    public static void main(String[] args) {
        int num=1124;
        int sum=0;
        int product=1;
        for(int i=num;i>0;i/=10){
            int rem=i%10;
            sum+=rem;
            product*=rem;
            
        }
        System.out.println("Sum Of Digit is: "+sum);
        System.out.println("Product of Digit is: "+product);
        if(sum==product)
        System.out.println(num+" Is Spy Number");
        else
        System.out.println(num+" Is not spy number");
        
    }
    
}
