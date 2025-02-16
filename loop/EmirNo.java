package loop;
public class EmirNo {
    public static void main(String[] args) {
        int num=13;
      
        int rev=0;
        for(int j=num;j>0;j/=10){
            int rem=j%10;
            rev=rev*10+rem;
        }
        System.out.println("Num:"+num);
        int k=2;
        for(k=2;k<rev;k++){
            if(rev%k==0){
                System.out.println("NUmber is not EmirpNO");
                break;
            }
        }
        System.out.println("Reverse:"+rev);
        if(rev==k){
            System.out.println("Number is EmirpNO");
        }

       
        }
        
    }
    

