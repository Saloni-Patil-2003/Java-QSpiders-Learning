package Loop;
import java.util.Scanner;

public class StonePaperSessorGame {
    public static void main(String []args){

        
        int rnum=0;
        for( ; ;){
            int num=(int)Math.random()*10;
            if(num>=1 && num<=3){
                rnum=num;
                break;
            }
        }
        String CodeOpt=null;
        if(rnum==1){
            CodeOpt="STONE";
        }
        else if(rnum==2){
            CodeOpt="PAPER ";
        }
        else if(rnum==3){
            CodeOpt="SESSOR ";
        }

        System.out.print("");
        System.out.println("WELCOME");
        System.out.println("1.STONE 2.PAPER 3.SESSOR");
        System.out.println("Enter Option");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        String useOpt=null;
        if (opt==1) {
            useOpt="STONE";
        }  

        else if (opt==2) {
            useOpt="PAPER";
        }
        
       else if (opt==3) {
            useOpt="SESSOR";
        } 
        else{
            System.out.println("Invalid input");   
            return; 
        }

        System.out.println("USER :"+useOpt +" BOT :"+CodeOpt);

        if(opt==1 && rnum==3 ||opt==2 && rnum==1 ||opt==3 && rnum==2){
            System.out.println("User Wins");
        }
       else if(opt==1 && rnum==2 ||opt==2 && rnum==3 ||opt==3 && rnum==1){
            System.out.println("Bot Wins");
        }

    }
    
}
