
/**
 * MasterPattern
 */
public class MasterPattern {

    public static void main(String[] args) {
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(n - j + 1 + " ");
        // }
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(n - i + 1 + " ");
        // }
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(n - i + 1 + " ");
        // }
        // for (int j = 1; j < i; j++) {
        // System.out.print(n - i + j + 1 + " ");
        // }

        // System.out.println();
        // }

        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(n - j + 1 + " ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + 1 + " ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + 1 + " ");
        // }
        // for (int j = 1; j < n - i; j++) {
        // System.out.print(i + j + 1 + " ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n - j + 1 + " ");
            }
            int k = (2 * n) - (2 * i);
            while (k >= 1) {
                System.out.print(n - i + 1 + " ");
                k--;
            }
            // for (int j = 1; j <= (2 * n) - (2 * i); j++) {
            // System.out.print(n - i + 1 + " ");
            // }
            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(n - i + 1 + " ");
            // }
            for (int j = 1; j < i; j++) {
                System.out.print(n - i + j + 1 + " ");
            }

            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(n - j + 1 + " ");
            }
            int k = 2 * i;
            while (k >= 1) {
                System.out.print(i + 1 + " ");
                k--;
            }
            // for (int j = 1; j <= 2 * i; j++) {
            // System.out.print(i + 1 + " ");
            // }
            // for (int j = 1; j <= i; j++) {
            // System.out.print(i + 1 + " ");
            // }
            for (int j = 1; j < n - i; j++) {
                System.out.print(i + j + 1 + " ");
            }
            System.out.println();
        }
    }
}