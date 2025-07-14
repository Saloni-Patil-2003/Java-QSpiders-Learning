package OOPs;

public class ThisBikeDriver {
    public static void main(String[] args) {
        ThisBikeEx tb=new ThisBikeEx();
        System.out.println(tb);
        tb.brand="KTM";
        tb.name="Duke 390";
        tb.mileage=20;
        tb.cc=390;
        tb.price=450000.0;

        tb.displayBike();
        System.out.println("___________________________________________________");

        ThisBikeEx tb1=new ThisBikeEx();
        System.out.println(tb1);
    
        tb1.brand="Omni";
        tb1.name="Maruti Suzuki Omni";
        tb1.mileage=20;
        tb1.cc=390;
        tb1.price=200000.0;
        tb1.displayBike2();

        
        
    }
    
}
