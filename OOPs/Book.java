package OOPs;

public class Book{
    
    String name;
    String author;
    int price;
    int publishyear;
    
    Book(){
        System.out.println("Default Constructor");

    }
    Book(String name){
        this.name=name;
    }
    Book(String name,String author){
        this(name);
        this.author=author;
    }
    Book(String name, String author,int price){
        this(name,author);
        this.price=price;

    }
    Book(String name, String author,int price,int publishyear){
        this(name,author,price);
        this.publishyear=publishyear;
    }
    void displayDetails(){
        System.out.println("name:"+name);
        System.out.println("author:"+author);
        System.out.println("price:"+price);
        System.out.println("publisheryear:"+publishyear);
    }
    
}
