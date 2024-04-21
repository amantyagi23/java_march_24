import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Case 1");
                
            case 2:
                System.out.println("Case 2");
                
            case 3:
                System.out.println("Case 3");
                
            default:
                System.out.println("Case else");
                
        }
    }
}
