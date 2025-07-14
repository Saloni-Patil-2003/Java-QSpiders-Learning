package OOPs;

public class Car {
    String model;
    String color;
    int speed;
    Car(String model,String color,int speed){
        this.model=model;
        this.color=color;
        this.speed=speed;
    }
    public void displayDetails(){
        System.out.println("Model:"+model);
        System.out.println("Color:"+color);
        System.out.println("Speed:"+speed);
    }
}
