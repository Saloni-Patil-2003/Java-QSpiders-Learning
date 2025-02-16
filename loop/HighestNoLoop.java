public class HighestNoLoop {
    public static void main(String[] args) {
        int num=1825353;
        int max=0;
        for(int i=num;i>0;i/=10){
            int rem=i%10;
            if(max<rem){
                max=rem;
            }

        }
        System.out.println("LArgest Number is:"+max);

        
    }
    
}
