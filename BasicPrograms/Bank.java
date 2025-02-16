import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String userName=null;
        String passWord=null;
        String address=null;
        long contact=0l;
        double balance=0.0;
        
for (; ; ) {
    

        System.out.println("__________WELCOME________");
        System.out.println("1.Create  Account");
        System.out.println("2. Existed User");
        System.out.println("Enter Option :");

       

       Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
         //Register  
        if(opt==1){
          
            
           System.out.println("UserName: ");
           userName=sc.next();
           System.out.println("Password: ");
           passWord=sc.next();
           sc.nextLine();
           System.out.println("Address: ");
           address=sc.nextLine();
           System.out.println("Contact: ");
           contact=sc.nextLong();
           System.out.println("Balance: ");
           balance=sc.nextDouble();



        }
        //Login
        else if(opt==2){
              if(userName==null){
                System.out.println("Create Your Account First");
                continue;
            }
            System.out.println("Login");
           
            for(int i=3;i>=1;i--)
        {
            System.out.println("Username : ");
            String  username1=sc.next();
            System.out.println("Password: ");
            String password1=sc.next();

            if(userName.equals(username1)&& passWord.equals(password1)){
                for (;  ; ) {
                    System.out.println();
                    System.out.println("_____________________________Home Page_______________________________________");
                    System.out.println();
                    System.out.println("1.DEPOSIT");
                    System.out.println("2.WITHDRAW");
                    System.out.println("3.CHECK BALANCE");
                    System.out.println("4.MINI");
                    System.out.println("5.login");
                    
                    System.out.println("Enter the optiom: ");
                    int opt1=sc.nextInt();
                    System.out.println();

                    switch(opt1) {
                        case 1:
                        {
                        System.out.println("DEPOSIT");
                        System.out.println();
                        System.out.println("Enter the amount:");
                        double depositeAmt=sc.nextDouble();
                        balance +=depositeAmt;
                        System.out.println("Amount Deposited Success and available balance is:"+balance);
                        System.out.println();
                        break;
                        }
                        case 2:{
                        System.out.println("WITHDRAW");
                        System.out.println();
                        System.out.println("Enter the amount:");
                        double withdrawAmt=sc.nextDouble();
                        if (balance>=withdrawAmt) {
                        balance -=withdrawAmt;
                        System.out.println("Amount withdraw Success and available balance is:"+balance);
                        System.out.println();
                        break; 
                        }
                        else{
                            System.out.println("you dont have enough Amount");
                        }
                      
                        }        

                    }




                }
                
            

            }
            else{
                System.out.println("Invalid Cridintial"+(i-1));
                
            }

        }
        System.out.println("THANK YOU AND NEVER VISIT AGAIN");
        System.exit(0);



        }
        else{
            System.out.println("Invalid Option");
            System.exit(0);
        }

    }  
    }
    
}
