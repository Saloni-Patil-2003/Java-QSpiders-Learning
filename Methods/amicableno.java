package Methods;

public class amicableno {
    public static void main(String[] args) {
      int num=1;
        for(int start=1;start<=1000;start++){
            if(num==factor(start)){
                System.out.println(start);
            }
            num++;

        }
    }
    

public static int factor(int num){
    int sum=0;
    for(int i=1;i<num;i++){
        if(num%i==0){
            sum+=i;

        }
    }
    return sum;
}
}
