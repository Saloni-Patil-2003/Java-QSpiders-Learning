package OOPs.Abstraction;

public class HpPrinterDriver {
   public static void main(String[] args) {
    HpPrinter h=new  Linux();
    h.print();
     HpPrinter h1=new  Windows();
     h1.print();
   }
   
   
    
}
