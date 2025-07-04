package Recursion;

public class Fibo {
    public static void main(String[] args) {
        fibo(10, 0, 1);
        
    }
    public static void fibo(int num,int n1,int n2){
        if(num!=0){
        int n3=n1+n2;
        System.out.println(n1);
        fibo(--num, n2, n3);
        }
        return;
    }
    
}
