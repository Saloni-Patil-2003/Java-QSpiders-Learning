package Methods;

public class PythagorenTriplate {
    public static void main(String[] args) {
        System.out.println(pythat(3, 4, 5));
        for(int start =1;start<10;start++){
    
            System.out.println(pentagonalno(start));
            
        }
        
    }
    public static boolean pythat(int n1,int n2,int n3){
        return (n1*n1)+(n2*n2)==(n3*n3);
    } 
    public static int pentagonalno(int num){
        num=num*(3*num-1)/2;
        return num;
    }
    
}
