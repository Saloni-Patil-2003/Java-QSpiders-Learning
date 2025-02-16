package loop;
public class AtoZRange {
    public static void main(String[] args) {
        int a=1;
        for (char i = 'A'; i <='Z';i+=a) {
            System.out.println(i);
            a++;
        }
    }
    
}
