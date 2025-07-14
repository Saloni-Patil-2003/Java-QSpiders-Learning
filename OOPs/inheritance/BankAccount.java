package OOPs.inheritance;

public class BankAccount {
    String name;
    String ifsc;
    String bankName;
    String branch;
    int pin;
    long phono;
    long accno;

    BankAccount(){

    }
    BankAccount(String name,String ifsc,String bankName,String branch,int pin,long phono,long accno){
        this.name=name;
        this.ifsc=ifsc;
        this.bankName=bankName;
        this.branch=branch;
        this.pin=pin;
        this.phono=phono;
        this.accno=accno;
    }

    public void displayBankAccount(){
        System.out.println(this);
        System.out.println(name);
        System.out.println(ifsc);
        System.out.println(bankName);
        System.out.println(branch);
        System.out.println(pin);
        System.out.println(phono);
        System.out.println(accno);
    }
    
}
