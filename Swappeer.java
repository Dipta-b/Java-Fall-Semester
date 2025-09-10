//Withut constructor 

public class Swappeer {
    int a, b;

    void swap(int x, int y) {
        a = x;
        b = y;

        System.out.println("Before swap A = " + a + ", B = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap A = " + a + ", B = " + b);
    }

    public static void main(String[] args) {
        Swappeer sp = new Swappeer();
        sp.swap(10, 5);
    }
}
