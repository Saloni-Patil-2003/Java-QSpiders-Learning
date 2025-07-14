package OOPs;

public class BankDriver {
    public static void main(String[] args) {
        Bank b=new  Bank("Saloni","Bank Of bordoda",998787564,123,12332.0);
       System.out.println(b.getName()+ b.getBankName()+b.getBalance(998787564,123));

       b.credit(998787564, 123, 2000);
       System.out.println(b.getBalance(998787564,123));
    }

    
}
