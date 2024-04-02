import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        // byte i = 100;
        // short y = i; // lower casting
        // int n = 2000;
        // short m = (short) n; // upper casting

        // System.out.println(m);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println("Enter num");
        int n = sc.nextInt();

        System.out.println("string " + s);
        System.out.println("Int " + n);

    }
}
