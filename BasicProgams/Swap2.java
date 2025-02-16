public class Swap2 {
    public static void main(String[] args) {
        
    
    int a=2;
    int b=4;
    System.out.println("Before swapping");
    System.out.println("a:"+a);
    System.out.println("b:"+b);

    a=a^b;
    b=a^b;
    b=a^b;

    System.out.println("After swapping");
    System.out.println("a:"+a);
    System.out.println("b:"+b);
    }
    
}
