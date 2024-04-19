import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Value");
        int a  = scan.nextInt();
        System.out.println("Enter Sec Value");
        int b  = scan.nextInt();
        int c = a+b;
        System.out.println("sum is : "+c);
        scan.close();
    }
}
