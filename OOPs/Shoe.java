package OOPs;

public class Shoe {
    {
        System.out.println("varibale declare and intialized Start");
    }
   
    double price;
    int size;
    String color;
    String brand="Nike";


    {
        System.out.println("varibale declare and intialized end");
    }
    
    public void disple(){
        System.out.println("method start");
        System.out.println(brand);
        System.out.println(price);
        System.out.println(size);
        System.out.println(color);
        System.out.println("metho end");
      
    }
    Shoe(){
        System.out.println("constructor start");
        System.out.println("consructor end");

    }
    Shoe(String brand,double price,int size,String color){
        this.brand=brand;
        this.price=price;
        this.size=size;
        this.color=color;
    }




    
}
