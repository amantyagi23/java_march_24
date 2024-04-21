package loop;

public class ArmStrong {
    public static void main(String[] args) {
        int n = 153;
        int m = n;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("count is " + count);
        n = m;
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            sum = sum + (int) Math.pow(i, count);
            n = n / 10;
        }

        System.out.println("Sum is " + sum);
        if (sum == m) {
            System.out.println("Arm strong number");
        }

        else {
            System.out.println("Not Arm strong");
        }

    }
}
