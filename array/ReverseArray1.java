package array;

public class ReverseArray1 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int temp[] = new int[arr1.length];

        for (int i = 0; i < temp.length; i++) {
            temp[temp.length - i - 1] = arr1[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr1[i] = temp[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }

    }
}
