import java.util.Scanner;

public class GoodPrimeNoLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int cnt=0;
        System.out.println("Good Prime Numbers up to " + num + ":");
        
        for (int j = 2; j <= num; j++) {
            
            int i;
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    break; 
                }
            }
            
            if (i == j) { 
                int temp = j;
                boolean allDigitsPrime = true;
                
                while (temp > 0) {
                    int rem = temp % 10;
                    
                   
                    int k;
                    for (k = 2; k < rem; k++) {
                        if (rem % k == 0) {
                            allDigitsPrime = false;
                            break;
                        }
                    }
                    
                    if (rem > 1 && k == rem) {
                        temp /= 10; 
                    } else {
                        allDigitsPrime = false;
                        break;
                    }
                }

                if (allDigitsPrime) {
                    System.out.print(j + " ");
                    cnt++;
                }
             
            }
             
        }
        System.out.println("count:"+cnt);
    }
}
