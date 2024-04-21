import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temp in Cel");
        int cel = sc.nextInt();

        int result = ((cel * (9)) / 5) + 32;

        System.out.println("Temp is " + result);

    }
}
