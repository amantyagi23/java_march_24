import java.util.Scanner;

public class Pattern1 {

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input");

        int n = sc.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
                // System.out.print(k + " ");
                // k = k + 1;
            }
            System.out.println();
        }
        sc.close();
    }
}
