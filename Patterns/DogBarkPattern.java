import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DogBarkPattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bark pattern:");
        String input = sc.nextLine();  // Taking input as a single string
        
        String[] barks = input.split(",");  // Splitting by commas
        Set<Integer> uniqueLengths = new HashSet<>();  // To store unique lengths
        
        for (String bark : barks) {
            uniqueLengths.add(bark.length());  // Adding unique lengths
        }
        
        int maxLength = Collections.max(uniqueLengths); // Find max unique length
        int count = 0;
        
        for (String bark : barks) {
            if (bark.length() == maxLength) {
                count++;  // Counting occurrences of max unique length
            }
        }
        
        System.out.println(count);  // Printing the count of max unique length
        sc.close();
     }
}
