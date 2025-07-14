package OOPs.inheritance;

public class FighterPlane extends Aeroplane {
    int gen;
    int seat;
    int range;
    String type;
    String refuel;

    public FighterPlane(){

    }

    public FighterPlane(String brand,double price,int engines,int year,int fuelCap,int speed,int wt,int cap,int gen,int seat,int range,String type,String refuel){
        this.brand=brand;
        this.price=price;
        this.engines=engines;
        this.year=year;
        this.fuelCap=fuelCap;
        this.speed=speed;
        this.wt=wt;
        this.cap=cap;

        this.gen=gen;
        this.seat=seat;
        this.range=range;
        this.type=type;
        this.refuel=refuel;
    }

    public void displayFighterplane(){
        displayAeroplane();
        System.out.println(gen);
        System.out.println(seat);
        System.out.println(range);
        System.out.println(type);
        System.out.println(refuel);
    }
    
}
