public class SqureRootProgram {
    public static void main(String[] args) {
        int num=36;
        boolean flag=false;
        for (int i = 1; i <=num; i++) {
            if (i*i==num) {
                flag=true;
                System.out.println(i+"is perfect Square root for:"+num);
                
            }
            if(i*i>num){
                break;
            }
            
        }
        System.out.println(flag);
        if (!flag) {
            System.out.println(num+"is not perfect square root");
            
        }
    }
    
}
