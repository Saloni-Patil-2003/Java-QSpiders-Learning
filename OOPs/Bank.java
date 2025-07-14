package OOPs;
public class Bank {

   private String name;
   private String bankName;
   private long acountNo;
   private int pin;
   private double balance;

   Bank(String name,String bankName,long acountNo,int pin,double balance){
    this.name=name;
    this.bankName=bankName;
    this.acountNo=acountNo;
    this.pin=pin;
    this.balance=balance;


   }
   public String getName(){
    return name;
   }
   public String getBankName(){
    return bankName;
   }
   public long acountNo(){
    return acountNo;
   } 

   public void setPin(long acountNo,int oldpin,int newpin){
    if(this.acountNo==acountNo && pin==oldpin){
        pin=newpin;
        System.out.println("pin updated");
    }
    else{
        System.out.println("Invalid Creadatials");
    }
   }
    public double getBalance(int acountNo,int pin){
        if(this.acountNo==acountNo && this.pin==pin){
            return balance;
        }
        else{
            System.out.println("Inavalid credentials");
            return 0;
        }
    }
    public void credit(long accNo,int pin,double amt){
        if(this.acountNo==accNo && this.pin==pin){
            if(amt>0){
                balance+=amt;
                System.out.println("Amount credited");
            }
            else{
                System.out.println("Amount invalid");
            }
        }
        else{
            System.out.println("Inavalid credentials");
        }
    }
    public void debit(long accNo,int pin,double amt){
        if (this.acountNo==accNo && this.pin==pin) {
            if(amt>0){
                if(balance-amt>1000){
                    balance-=amt;
                    System.out.println("Amount debited");
                }
                else{
                    System.out.println("Invalid Amount");
                }
            }
            
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }

    
}
