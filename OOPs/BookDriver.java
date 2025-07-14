package OOPs;

public class BookDriver {
    public static void main(String[] args) {
          Book b=new Book();
        
        b.displayDetails();
        
        Book b1=new Book("1984", "George Orwell", 100, 1949);
        b1.displayDetails();

          Book b2=new Book("1984", "George Orwell");
        b2.displayDetails();
        
    }
    
}
