package OOPs;

public class FormDriver {
    public static void main(String[] args) {
        System.out.println("Object loading not yet Start");
        Form f=new Form();
        f.display();
        Form f1=new Form("Saloni",705892797);
        f1.display();
        Form f2=new Form("Saloni",705892797,"saloni@gmail.com",21);
        f2.display();

        
    }
    
}
