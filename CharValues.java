public class CharValues {
    public static void main(String[] args) {
        char a = 'A' - 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((a + j) % 2 == 0) {
                    System.out.print((char) (a + j));
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
