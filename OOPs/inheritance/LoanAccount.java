package OOPs.inheritance;

public class LoanAccount extends BankAccount {
    int loanAmount;
    int period;
    String typeOfLoan;

    LoanAccount(){

    }
    LoanAccount(String name,String ifsc,String bankName,String branch,int pin,long phono,long accno,int loanAmount,int period,String typeOfLoan){
        this.name=name;
        this.ifsc=ifsc;
        this.bankName=bankName;
        this.branch=branch;
        this.pin=pin;
        this.phono=phono;
        this.accno=accno;

        this.loanAmount=loanAmount;
        this.period=period;
        this.typeOfLoan=typeOfLoan;


    }

    public void displayLoanAccount(){
        displayBankAccount();
        System.out.println(loanAmount);
        System.out.println(period);
        System.out.println(typeOfLoan);
    }


    
}
