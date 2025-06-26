package Methods;

public class tetrahedralNo {
    public static void main(String[] args) {
for(int i=1;i<=10;i++){
    
        System.out.println(teraheno(i));
    
  
}
        
    }
    public static int teraheno(int num){
        int num1=(num*(num+1)*(num+2))/6;
        return num1;
    }
    
}
