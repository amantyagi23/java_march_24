
/**
 * MasterPattern
 */
public class MasterPattern {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n - j + " ");
            }
            int k = (2 * (n - i)) - 1;
            while (k > 1) {
                System.out.print(n - i + " ");
                k--;
            }
            for (int j = 0; j < i; j++) {
                System.out.print((n + j) - i + 1 + " ");
            }
            System.out.println();

        }

        for (int i = 1; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(j + i + " ");
            }
            int k = (2 * i) + 1;
            while (k > 1) {
                System.out.print(i + 1 + " ");
                k--;
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();

        }

        // for (int i = n; i >= 1; i--) {
        // for (int j = n; j >= i; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
    }
}