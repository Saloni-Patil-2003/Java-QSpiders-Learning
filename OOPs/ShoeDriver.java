package OOPs;

public class ShoeDriver {
    public static void main(String[] args) {
        Shoe s1=new Shoe();
       
        s1.price=10;
        s1.size=10;
        s1.color="blue";
     
        s1.disple();
        Shoe s=new Shoe("rookee",23432.3,10,"red");
     
        s.disple();
    
       
    }
    
}
