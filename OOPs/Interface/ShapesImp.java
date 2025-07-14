package OOPs.Interface;

public class ShapesImp implements Shapes{
    @Override
    public void areaOfSquare(int side) {
        int area=side*side;
        System.out.println(area);
        
    }
    @Override
    public void perimeterOfSquare(int sides) {
        int perimeter=4*sides;
        System.out.println(perimeter);
    }
    
}
