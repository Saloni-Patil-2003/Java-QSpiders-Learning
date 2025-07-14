package OOPs;

public class Form {
    String name;
    String email;
    long phno;
    int age;
    char c;

    Form(){
        System.out.println("First constructor");

    }
    Form(String name,long phno){
        System.out.println("Contructor 2 Start");
        this.name=name;
        this.phno=phno;
        System.out.println("Contructor 2 end");

    }
    Form(String name, long phno,String email){
        System.out.println("Constructor 3 Start");
        this.name=name;
        this.email=email;
        this.phno=phno;
        System.out.println("Constructor 3 End");

    }
    Form(String name,long phno,String email,int age){
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

    
}
