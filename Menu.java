import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        System.out.println("Enter Choose");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("Wrong 2");
                break;
        }
    }

}