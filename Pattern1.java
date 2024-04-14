import java.util.Scanner;

/**
 * Pattern1
 */
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {
                // i-j+1
                int k = i-j+1;
                if(k%2 == 0){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        
        // for (int i = 0; i < n; i++) {
        //     for (int j = i+1; j >0; j--) {
        //         if(j%2 == 0){
        //             System.out.print(j+" ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}