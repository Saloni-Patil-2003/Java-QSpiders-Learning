public class pattern19 {
    public static void main(String[] args) {
        char ch='a';
        for(int i=1;i<=5;i++){
            for (int j = 1; j <=i; j++) {
                if(i%2!=0){
                    System.out.print(ch++ +" ");
                }else{
                    System.out.print(j+" ");
                    
                }
                
            }
            System.out.println();
           
            
    }
}
}
