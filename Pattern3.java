import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char k ='a';
        int n = sc.nextInt();

        for (char i = 65; i < 65+n; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
               System.out.print((k+j)+" ");
            }
            System.out.println();
        }
    }
}
