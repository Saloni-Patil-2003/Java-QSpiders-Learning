package OOPs.inheritance;

public class BankAccountDriver {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount("saloni", "IFSC", "Bank Of India", "Yavluj", 123, 6365532212l, 1234232, 2000, 212, "saving");
       
        s.displayBankAccount();

        System.out.println("__________________________________________");
        s.displaySavingAccount();
        System.out.println("_____________________________________");
        BankAccount b =new BankAccount("saloni", "IFSC", "Bank Of India", "Yavluj", 123, 6365532212l, 1234232);
        b.displayBankAccount();

        System.out.println("___________________________________");

        LoanAccount l=new LoanAccount("saloni", "IFSC", "Bank Of India", "Yavluj", 123, 6365532212l, 1234232, 20000, 2, "Education");
        l.displayLoanAccount();

        System.out.println("________________________________________");
        DematAccount d=new DematAccount("saloni", "IFSC", "Bank Of India", "Yavluj", 123, 6365532212l, 1234232,10000,120292,1);
        d.displayDematAccount();
    }
    
}
