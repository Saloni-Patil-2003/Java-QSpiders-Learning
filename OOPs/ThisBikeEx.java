package OOPs;

public class ThisBikeEx {
    String brand;
    String name;
    double price;
    int cc;
    int mileage;

    public void displayBike(){
        
        String name="Chapri Bike";
        System.out.println(this);
        
        System.out.println("Brand:"+brand);
        System.out.println("Name:"+name);
        System.out.println("Name this:"+this.name);
        System.out.println("Price:"+price);
        System.out.println("Cc:"+cc);
        System.out.println("mileage:"+mileage);
    }

    public void displayBike2(){
        String name="kidnap Car";
       System.out.println(this);
        
        System.out.println("Brand:"+brand);
        System.out.println("Name:"+name);
        System.out.println("Name this:"+this.name);
        System.out.println("Price:"+price);
        System.out.println("Cc:"+cc);
        System.out.println("mileage:"+mileage);
    }
    
    
}
