public class Triangle1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j>=1; j--) {
                System.out.print("  ");
            }
            // for (int j = 1; j <= i; j++) {
            //     System.out.print("0 ");
            // }
            // for (int j = 1; j < i; j++) {
            //     System.out.print("0 ");
            // }
            int k = 2*i -1;
            // k = 3;
            while(k!=0){
                System.out.print("* ");
                k--;
            }
            System.out.println();
        }
    }
}
