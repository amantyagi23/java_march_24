package NextedLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input");
        int n = sc.nextInt();

        boolean flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Not A Prime Number " + n);
        } else {
            System.out.println("Prime Number " + n);
        }
    }
}
