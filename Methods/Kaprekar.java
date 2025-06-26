package Methods;

public class Kaprekar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (kaprekarNo(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to square the number
    public static int pow(int num) {
        return num * num;
    }

    // Function to count digits in a number
    public static int countDigits(int num) {
        int len = 0;
        while (num > 0) {
            len++;
            num /= 10;
        }
        return len;
    }

    // Function to check Kaprekar Number
    public static boolean kaprekarNo(int num) {
        if (num == 1) 
            return true;

        int square = pow(num);
        int d = countDigits(square);

        // **Fix: Loop to try different splits**
        for (int i = 1; i < d; i++) {  
            int divisor = (int) Math.pow(10, i);
            int leftPart = square / divisor;
            int rightPart = square % divisor;

            if (rightPart > 0 && (leftPart + rightPart) == num) {
                return true;
            }
        }
        return false;
    }
}
