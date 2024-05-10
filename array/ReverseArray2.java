package array;

public class ReverseArray2 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 6, 7, 1, 9, 4 };
        // {4,9,1,7,6,1,4,2}
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
