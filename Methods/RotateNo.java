package Methods;



public class RotateNo {
    public static void main(String[] args) {
        int ip=1234;
       int rot=rotate(ip);
       while (rot!=ip) {
        System.err.println(rot);
        rot=rotate(rot);
        
       }
       System.out.println(rot);
    }
    public static int rotate(int num){
        return (num%10)*power(10, count(num)-1)+(num/10);

    }
    static int count(int num){
        int ct=0;
        for(int i=num;i>0;i/=10){
            ct++;
        }
        return ct;
    }
    static int power(int digit,int ct){
        int pow=1;
        for(int i=1;i<=ct;i++){
            pow*=digit;
        }
        return  pow;
    }
    
}
