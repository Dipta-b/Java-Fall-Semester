public class Swapper {

    int a, b;

    // constructor
    Swapper(int x, int y) {
        a = x;
        b = y;
    }

    // method
    void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Swapper sp = new Swapper(2, 3);

        System.out.println(("Beffore swap A = " + sp.a + ", B = " + sp.b));
        sp.swap();
        System.out.println(("After swap A = " + sp.a + ", B = " + sp.b));

    }
}
