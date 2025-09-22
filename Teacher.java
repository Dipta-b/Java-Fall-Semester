/*
 * Ekta class diye koyekta object create kora hoyeche.
 */

public class Teacher {
    String name, gender;
    int phone;

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(); // Create an object of Teacher class
        teacher1.name = "Dipta Banik";
        teacher1.gender = "MAlE";
        teacher1.phone = 712345678;

        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone);

        Teacher teacher2 = new Teacher();
        teacher2.name = "Gold Berg";
        teacher2.gender = "Female";
        teacher2.phone = 712345679;

        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: " + teacher2.phone);
    }
}
