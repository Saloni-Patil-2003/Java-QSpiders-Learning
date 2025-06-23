package loop;
class SunnyNo{
    public static void main(String[] args) {
        int num=19;
        int sum=0;
        for(int i=num;i>0;i/=10){
            int rem=i%10;
            int sqr=rem*rem;
             sum=sum+sqr;
        }

        System.out.println(sum==num?num+"is sunny no":num+"is not sunny no");
        
    }

}