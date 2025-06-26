package Methods;

public class HappyNo {
    public static void main(String[] args) {
        
        System.out.println(HappyNuber(7));
    }
    static boolean HappyNuber(int num){
        int sum=sumOfSqOdDigit(num);
        while(sum!=1 && sum!=4){
            sum=sumOfSqOdDigit(sum);
        }
        return sum==1?true:false;
    }
    static int sumOfSqOdDigit(int num){
        int sum=0;
        for(int i=num;i>0;i/=10){
            int last=num%10;
            sum+=last*last;
        }
        return sum;
    }
    
}
