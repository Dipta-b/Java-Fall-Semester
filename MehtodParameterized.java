/*
 * Arguments/Parameters in method
 */

public class MehtodParameterized {

    String name, gender;
    int phone;

    void setInfo(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        MehtodParameterized teacher1 = new MehtodParameterized();

        teacher1.setInfo("Dipta Banik", "Male", 712345678);
        teacher1.displayInfo();

        MehtodParameterized teacher2 = new MehtodParameterized();
        teacher2.setInfo("Gold Berg", "Female", 712345679);
        teacher2.displayInfo();
    }
}
