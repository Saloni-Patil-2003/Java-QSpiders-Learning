package operator;
public class LargeNo {
    public static void main(String[] args) {
        int a=1000;
        int b=201; 
        int c=30;
         int large=(a>b)?(a):((b>c)?(b):(c));
         System.out.println("Largest Number is:"+large);

         int small=(a<b)?(a):((b<c)?(b):(c));
         System.out.println("Largest Number is:"+small);
        
    }
    
}
