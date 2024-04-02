package loop;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 200000;
        // while (n > 0) {
        // System.out.println("number " + n);
        // n = n / 2;
        // }
        for (int i = 0; n > 0; i++) {
            System.out.println("num is " + n + "i is" + i);
            n = n / 2;

        }
    }
}
