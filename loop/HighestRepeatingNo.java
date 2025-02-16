public class HighestRepeatingNo {
    public static void main(String []args){
        int num=1234523322;
        int max=0;
        int min=9;
        int maxDigit = -1;
        int minDigit = 2;
        for (int i = 0; i <=9; i++) {
            int cnt=0;
        for(int j=num;j>0;j/=10){
            int rem=j%10;
            if(i==rem){
                cnt++;
               
            }
        }
        if(cnt!=0)

        System.out.println(i+":" +cnt);
        if(max<cnt){
        max=cnt;
        maxDigit=i;
       
        }
        if(min>cnt){
            min=cnt;
            minDigit=i;
           
            }
            
            
            }
            System.out.println("Max repeating number is: " + maxDigit + " with frequency: " + max);
           
            
            System.out.println("Max repeating number is: " + minDigit + " with frequency: " + min);
            
        }
      
        
        

    }
    

