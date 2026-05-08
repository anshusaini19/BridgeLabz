import java.util.Scanner;

public class Zeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;

        while (i < n && arr[i] != 0) {
            i++;
        }

        int j = i + 1;

        while (j < n) {

            if (arr[j] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }

            j++;
        }

        System.out.println("Array after moving zeroes:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
