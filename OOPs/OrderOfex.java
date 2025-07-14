package OOPs;

public class OrderOfex {
    static String name;
       
        String email;
        long phno;
        int age;
        char c;
    
        OrderOfex(){
            System.out.println("First constructor");
           String name="hi";
            System.out.println(this.name);
    
        }
        OrderOfex(String name,long phno){
            System.out.println("Contructor 2 Start");
            this.name=name;
            this.phno=phno;
            System.out.println("Contructor 2 end");
    
        }
        OrderOfex(String name, long phno,String email){
            System.out.println("Constructor 3 Start");
            this.name=name;
            this.email=email;
            this.phno=phno;
            System.out.println("Constructor 3 End");
    
        }
        OrderOfex(String name,long phno,String email,int age){
            this.name=name;
            this.email=email;
            this.phno=phno;
            System.out.println("Constructor 4 Start");
         
            this.age=age;
            System.out.println("Constructor 4 End");
    
    
        }
        public void display(){
            System.out.println("name:"+name);
            System.out.println("phono:"+phno);
            System.out.println("email:"+email);
            System.out.println("age:"+age);
        }
        public static void main(String[] args) {
            OrderOfex o=new OrderOfex();
            o.display();
        }
    
        
    }
    
    

