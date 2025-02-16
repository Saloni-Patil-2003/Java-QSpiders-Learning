public class series2 {
    public static void main(String args[]){
        int num=0;
        for(int i=2;i<=5;i++){
            for(int pow=2;pow<10;pow+=2){
             num=i*pow+num;
             System.out.println(num);
            }
            
             
        }
        
    }
    
}
