package array;

/**
 * Addition
 */
public class Addition {
    public static void main(String[] args) {
        int arr1[] = { 9, 2, 3, 4 };
        int arr2[] = { 3, 4, 5, 6 };
        int sumLen;

        if (arr1.length > arr2.length) {
            sumLen = arr1.length;
        } else {
            sumLen = arr2.length;
        }

        int sum[] = new int[sumLen];
        int carry = 0;

        for (int i = sumLen - 1; i >= 0; i--) {
            int digit = arr1[i] + arr2[i] + carry;
            if (digit > 9) {
                carry = digit / 10;
                digit = digit % 10;
                sum[i] = digit;
            } else {
                sum[i] = digit;
                carry = 0;
            }

        }
        int finalLen;
        int result[] = new int[sumLen];
        if (carry > 0) {
            finalLen = sumLen + 1;
            result = new int[finalLen];
            result[0] = carry;
            for (int j = 1; j < result.length; j++) {
                result[j] = sum[j - 1];
            }
        } else {
            for (int j = 0; j < result.length; j++) {
                result[j] = sum[j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }

    }
}