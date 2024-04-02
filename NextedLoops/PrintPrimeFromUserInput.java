package NextedLoops;

import java.util.Scanner;

public class PrintPrimeFromUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % 2 == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Prime Number " + i);
            }
        }
    }
}
