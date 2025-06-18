package loop;

import java.util.Scanner;

public class DuckNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  num=sc.next();
        
            if(num.charAt(0)=='0'){
                System.out.println(num+"is not dock no");
               
            }

           else if(num.contains("0")){
                System.out.println("it is dock no");
    
            }
            else{
                System.out.println("It is not dock no");
            }
           
        
        
       
        
    }
    
}
