package OOPs.inheritance;

public class DematAccount extends BankAccount{
    double balance;
    double brokerage;
    int id;

    DematAccount(){

    }
    DematAccount(String name,String ifsc,String bankName,String branch,int pin,long phono,long accno,double balance,double brokerage,int id){
        this.name=name;
        this.ifsc=ifsc;
        this.bankName=bankName;
        this.branch=branch;
        this.pin=pin;
        this.phono=phono;
        this.accno=accno;

        this.balance=balance;
        this.brokerage=brokerage;
        this.id=id;


    }
    public void displayDematAccount(){
        displayBankAccount();
        System.out.println(balance);
        System.out.println(brokerage);
        System.out.println(id);
    }
    
}
