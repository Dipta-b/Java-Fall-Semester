/*
 * Method er maddhome kora hoiche eta
 */

public class Method {
    String name, gender;
    int phone;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        Method teacher1 = new Method();
        teacher1.name = "Dipta Banik";
        teacher1.gender = "Male";
        teacher1.phone = 712345678;
        teacher1.displayInfo();

        Method teacher2 = new Method();
        teacher2.name = "Gold Berg";
        teacher2.gender = "Female";
        teacher2.phone = 712345679;
        teacher2.displayInfo();
    }
}
