package Methods;

public class SphenicNo {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++)
        if (isSphenic(i)) {
            System.out.println(i);
        }
        // ✅ Should return true (30 = 2 × 3 × 5)
    }

    public static boolean isSphenic(int num) {
        int count = 0;  // Count of distinct prime factors
        int product = 1; // Product of distinct prime factors
        int originalNum = num; // Store original number for verification

        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {  // Check if i is a prime factor
                count++;
                product *= i;

                // Remove all occurrences of the same prime factor
                while (num % i == 0) {
                    num /= i;
                   
                }
            }
            if (count > 3) { // If more than 3 distinct prime factors, return false
                return false;
            }
        }

        return count == 3 && product == originalNum; // Must have exactly 3 distinct prime factors
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
