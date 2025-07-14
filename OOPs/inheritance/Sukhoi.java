package OOPs.inheritance;

public class Sukhoi extends FighterPlane {
    String model;
    int years;
    String weapons;
    String country;
    String service;

    public Sukhoi(){

    }

    public Sukhoi(String brand,double price,int engines,int year,int fuelCap,int speed,int wt,int cap,int gen,int seat,int range,String type,String refuel,
    String model,int years,String weapons,String country,String service){
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

        this.model=model;
        this.years=years;
        this.weapons=weapons;
        this.country=country;
        this.service=service;



    }

    public void diplaySukhoi(){
        displayFighterplane();
        System.out.println(model);
        System.out.println(years);
        System.out.println(weapons);
        System.out.println(country);
        System.out.println(service);
    }
    
}
