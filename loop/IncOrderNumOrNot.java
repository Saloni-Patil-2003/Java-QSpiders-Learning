package loop;
public class IncOrderNumOrNot {
    public static void main(String[] args) {
        int num=1234;
        boolean flag=true;
        for(int i=num;i>0;i/=10){
            
            int rem=i%10;//4
            int inc=i%100;//34
            int inc2=inc/10;//3
            
            if(inc2>rem){//3 >4
                flag=false;
                break;
            }

        } 
        if(flag){
            System.out.println(num+"  is increasing order");
        }
        else{
            System.out.println(num+" Not increasing order");
        } 
    }
    }
