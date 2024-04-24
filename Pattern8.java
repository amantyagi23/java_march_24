import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pattern8 {
    public static void main(String[] args) {

        int n = 5;
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print((char) (a) + " ");
            }
            System.out.println();
        }
    }
}
