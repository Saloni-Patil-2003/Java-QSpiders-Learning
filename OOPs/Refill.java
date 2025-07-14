package OOPs;
public class Refill{
    String color;
    double size;
    String refilltype;
    Refill(){
        System.out.println("Refill created1");
    }

    Refill(String color,double size,String refilltype){
        this.color=color;
        this.size=size;
        this.refilltype=refilltype;
        System.out.println("Refill created2");
    }

     void displayrefill(){
        System.out.println(color);
        System.out.println(size);
        System.out.println(refilltype);
     }
    
}
