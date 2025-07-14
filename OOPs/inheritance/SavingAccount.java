package OOPs.inheritance;

public class SavingAccount extends BankAccount {
    double balance;
    double intrest;
    String type;
     
    SavingAccount(){

    }
    SavingAccount(String name,String ifsc,String bankName,String branch,int pin,long phono,long accno,double balance,
    double intrest,String type){
         
        this.name=name;
        this.ifsc=ifsc;
        this.bankName=bankName;
        this.branch=branch;
        this.pin=pin;
        this.phono=phono;
        this.accno=accno;
        
        this.balance=balance;
        this.intrest=intrest;
        this.type=type;
    }

    public void displaySavingAccount(){
        System.out.println(this);
        System.out.println(balance);
        System.out.println(intrest);
        System.out.println(type);
        
       
    }

  
    
}
