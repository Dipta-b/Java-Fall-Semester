/*
 * constructor beobahar kora hoy karon jokhon object create kora hoy tokhon e initialize kora hoy
 * constructor er nam class er nam er soman hote hobe 
 */

public class Constructor {

    String name;
    int age;

    // Constructor to initialize the object
    public Constructor(String n, int a) {
        this.name = n; // 'this' keyword is used to refer to the current object's instance variable
        this.age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + name);

        System.out.println("Age: " + age + "\n");
    }

    public static void main(String[] args) {
        // Creating an object of the Constructor class and initializing it using the
        // constructor
        //

        Constructor person1 = new Constructor("Alice", 30);
        person1.displayInfo();

        Constructor person2 = new Constructor("Bob", 25);
        person2.displayInfo();
    }

}
