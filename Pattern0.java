import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}