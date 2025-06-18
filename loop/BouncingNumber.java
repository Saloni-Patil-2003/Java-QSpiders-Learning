package loop;

import java.util.Scanner;

public class BouncingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
       

        boolean isIncreasing = false, isDecreasing = false;

        for (int i = 0; i < num.length() - 1; i++) {
            char current = num.charAt(i);
            char next = num.charAt(i + 1);

            if (current < next) {
                isIncreasing = true;
            } else if (current > next) {
                isDecreasing = true;
            }

            
            if (isIncreasing && isDecreasing) {
                System.out.println("Bouncing");
                return;  
            }
            else{
                
            }
        }

       
        if (isIncreasing) {
            System.out.println("Increasing");
        } else if (isDecreasing) {
            System.out.println("Decreasing");
        }
    }
}
