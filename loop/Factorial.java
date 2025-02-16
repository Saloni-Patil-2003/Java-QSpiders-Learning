package loop;
public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        int sum=0;
        for (int i = num; i >=1; i--) 
            {
              fact *=i;
              sum+=fact;
            }
                System.out.println(fact);
                System.out.println("sum of fact:"+sum);
    
            
            
        
        
    }
    
}
