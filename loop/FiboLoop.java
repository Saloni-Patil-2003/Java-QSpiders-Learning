package loop;
public class FiboLoop {
    public static void main(String[] args) {
        int num=8;
        int n=0;
        int n1=1;
        for(int i=1;i<=num;i++){
          
            System.out.println(n);

            int num3=n1+n;
            n=n1;
            n1=num3;

        }
    }
    
}
