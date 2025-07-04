package Recursion;

public class Revesrse {
    public static void main(String[] args) {
        revesrse(123, 0);

    }
    public static void revesrse(int num,int rev){
        if(num!=0){
        rev=rev*10+num%10;
        
        revesrse(num/10, rev);
       
    }
    else if(num==0)
    System.out.println(rev);
    return ;
    }

    
}
