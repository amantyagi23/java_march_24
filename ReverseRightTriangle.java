public class ReverseRightTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
