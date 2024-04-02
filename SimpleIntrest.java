import java.util.Scanner;
import java.util.*;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        System.out.println("Enter Intrest");
        int intrest = sc.nextInt();
        System.out.println("Enter Time");
        int time = sc.nextInt();

        int si = (amount * intrest * (time / 12)) / 100;
        System.out.println("SI = ");
        System.out.println(si);

    }
}