package loop;

import java.util.Scanner;

public class DecOrderNumOrNot {
  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String num = sc.next().toLowerCase();
       

        boolean  isDecreasing = false;

        for (int i = 0; i < num.length() - 1;i++) {
            char current = num.charAt(i);
            char next = num.charAt(i + 1);

            if (current > next) {
                isDecreasing = true;
            }

            
            if (isDecreasing) {
                System.out.println("decressing");
                return;  
            }
            else{
                System.out.println("not decresing");
                return;
            }
        }

      
        
        }
        }
    