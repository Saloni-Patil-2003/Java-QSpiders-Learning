import java.util.Scanner;
public class CurConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Amount in INR:");
        float inr = sc.nextFloat();  // Taking INR input

        System.out.println("List of Currencies:");
        System.out.println("1. USd");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. PKR (Pakistani Rupee)");

        System.out.println("Enter The Currency:");
        String curr = sc.next().toUpperCase();  // Convert input to uppercase

        float convertedAmount = 0;

        if (curr.equals("USd")) {
            convertedAmount = inr / 86.85f;  // INR to USD conversion rate
            System.out.println(inr + " INR = " + convertedAmount + " USD");
        } 
        else if (curr.equals("EUR")) {
            convertedAmount = inr / 93.50f;  // INR to Euro conversion rate
            System.out.println(inr + " INR = " + convertedAmount + " EUR");
        } 
        else if (curr.equals("GBP")) {
            convertedAmount = inr / 106.75f;  // INR to British Pound conversion rate
            System.out.println(inr + " INR = " + convertedAmount + " GBP");
        } 
        else if (curr.equals("PKR")) {
            convertedAmount = inr * 2.85f;  // INR to Pakistani Rupee conversion rate
            System.out.println(inr + " INR = " + convertedAmount + " PKR");
        } 
        else {
            System.out.println("Invalid currency selection. Please enter USD, EUR, GBP, or PKR.");
        }

        sc.close();  // Closing scanner to prevent memory leaks
    }
}
