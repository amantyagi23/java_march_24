import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char s = 'A';
            for (int j = i + 1; j > 0; j--) {
                System.out.print(s + " ");
                s++;
            }

            System.out.println();
        }
    }
}
