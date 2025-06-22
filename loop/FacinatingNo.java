package loop;

public class FacinatingNo {
    public static void main(String[] args) {
        int num=327;
        int dup=num;
        int len=0;
        boolean flag=true;
        int dev=1;
        for(int i=num;i>0;i/=10){
            len++;

        }
        for(int i=1;i<=len;i++){
            dev*=10;
        }
        int sqr=num*num;
       num=(num*dev)+(sqr)+(dup*3);
       System.out.println(num);
       for(char i='1';i<='9';i++){
        int cnt=0;
        for(int j=num;j>0;j/=10){
            int ch=i%10;
            if(ch==i)
            cnt++;
        }
        if(cnt!=1){
            flag=false;
            break;
        }
    }
    if(flag){
        System.out.println(num+" is facinating number");

    }
    else{
        System.out.println(num+" is not Facinating number");
    }

       

    }
    
}

