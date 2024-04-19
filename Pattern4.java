public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        char a = 'A' - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j > 0; j--) {
                int k = a + j;
                if (k % 2 == 0) {
                    System.out.print((char) k + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
