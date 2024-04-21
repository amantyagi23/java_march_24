/**
 * Pattern6
 */
public class Pattern6 {

    public static void main(String[] args) {
        int n = 6;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = n - i - 1; j > 0; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = (n * 2) - i; j > 0; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}