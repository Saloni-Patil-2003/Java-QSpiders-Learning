package Methods;

public class A {
    public static void main(String[] args) {
        
        System.out.println(isArnStrong(153));
        System.out.println(count(153));
    }
    static boolean isArnStrong(int num){
        int sum=0;
        for(int i=num;i>0;i/=10)
        
        sum+=factorial(i%10,count(num));

        return sum==num;
    }

static int factorial(int num,int ct){
    int fact=1;
    for(int i=ct;i>0;i--)
    {
        fact*=i;
    }
return fact;

}
static int count(int num){
    int ct=0;
for(int i=num;i>=0;i/=10){
    ct++;
}
return ct;
}
}