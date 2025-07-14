package OOPs;
public class Staticvariable{
    // Static variable, shared by all instances of SharedCounter
    private static int counter = 0;

    public Staticvariable() {
        // Increment the static counter each time a new object is created
        counter++;
        System.out.println("New object created. Current counter value: " + counter);
    }

    // Static method to get the current value of the shared counter
    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        // Create multiple objects of SharedCounter
        Staticvariable obj1 = new Staticvariable(); // counter becomes 1
        Staticvariable obj2 = new Staticvariable(); // counter becomes 2
        Staticvariable obj3 = new Staticvariable(); // counter becomes 3

        // Access the static variable directly using the class name
        System.out.println("Final counter value accessed via class: " + Staticvariable.getCounter());

        // Demonstrate that any object can access the shared static variable
        // Even though obj1, obj2, and obj3 are distinct objects,
        // they all refer to the *same* 'counter' variable.
        System.out.println("Counter value from obj1: " + obj1.getCounter());
        System.out.println("Counter value from obj2: " + obj2.getCounter());
        System.out.println("Counter value from obj2: " + obj3.getCounter());
    }
}