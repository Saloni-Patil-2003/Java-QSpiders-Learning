package OOPs.Interface;

public class ShapesDriver {
    public static void main(String[] args) {
        Shapes s=new ShapesImp();
        s.areaOfSquare(10);
        Shapes.areaOfcircle(10);
        s.perimeterOfSquare(10);


    }
    
}
