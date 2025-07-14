package OOPs;

public class Pen {
    String brand;
    double price;
    String type;
    Refill ref;

    Pen(){
        System.out.println("Pen is created");

    }
    Pen(String brand,double price,String type,String color,double Size,String refilltype){
        ref=new Refill(color, 0, refilltype);
       this.brand=brand;
        this.price=price;
        this.type=type;
        
         System.out.println("Pen Created");

    }
    public void display(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(type);
       
    }
    
}
