package OOPs;

public class PenDriver {
    public static void main(String[] args) {
        Pen p=new Pen("Renaldo", 10.0, "Boll pen","Blue",0.7,"ball point");
        p.display();
        System.out.println("_________________________");
        p.ref.displayrefill();
    }
    
}
