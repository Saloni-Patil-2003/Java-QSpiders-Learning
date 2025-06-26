package Methods;

import java.util.Scanner;

public class return1 {
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
       System.out.println( fullName(sc.next(), sc.next()));
        
    }
    public static String fullName(String first,String last){
        String fullname=first+" "+last;
        return fullname;

    }
    
}
