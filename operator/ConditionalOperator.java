package operator;
public class ConditionalOperator {
    public static void main(String[] args){
        int a=10;
        int b=200;
        int c=30;
        int larger=((a>b)?((a>c)?(a):(c)):((b>c)?(b):(c)));
        System.out.println(larger);
    }
    
}
