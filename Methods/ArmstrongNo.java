package Methods;
public class ArmstrongNo {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            if(isArmStrongNo(i)){
                System.out.println(i);
            }
        }
    }
       

public static boolean isArmStrongNo(int num){
   
    int sum=0;
    for(int i=num;i>0;i/=10){
        sum+=power(i%10,count(num));
    }
    return sum==num;

}
    public static int count(int num){
        int ct=0;
        for(int i=num;i>0;i/=10)
        {
            ct++;

        }
        return ct;
    }
    public static int power(int digit,int ct){
        int pow=1;
        for(int i=1;i<=ct;i++){
        pow*=digit;
        }
        return pow;
    }
    
    
}
