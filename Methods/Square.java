package Methods;

import loop.peternson;

public class Square {
    public static void main(String[] args) {
       
        System.out.println("Squere:" +square(10));
        System.out.println("maximum Number of given number is:"+maximum(50, 30));
        System.out.println(isEven(1));
        
    }
    public static int square(int num){
        num*=num;
        return num;
    }
    public static int maximum(int n1,int n2){
        int max=(n1>n2)?n1:n2;
        return max;
    }
    public static boolean isEven(int num){
        return (num%2==0)?true:false;
    }
    
}

