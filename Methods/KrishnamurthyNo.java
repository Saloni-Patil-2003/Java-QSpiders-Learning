package Methods;

public class KrishnamurthyNo {//peterson number
    public static void main(String[] args) {
        for(int i=1;i<=100000;i++)
        if(krishnamurthyNo(i)){
        
        System.out.println(i);
        }
    }
    static boolean krishnamurthyNo(int num){
        int sum=0;
        for(int i=num;i>0;i/=10)
        
        sum+=factorial(i%10);

        return sum==num;
    }

static int factorial(int num){
    int fact=1;
    for(int i=num;i>0;i--)
    {
        fact*=i;
    }
return fact;

}

}