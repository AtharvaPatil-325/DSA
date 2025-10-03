import java.util.Scanner;

public class DifferenceOfTwoArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array1 (smaller number)
        System.out.println("Enter size of array1:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of array1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input array2 (bigger number)
        System.out.println("Enter size of array2:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of array2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[n2];

        int i = n1 - 1;  // pointer for arr1
        int j = n2 - 1;  // pointer for arr2
        int k = result.length - 1;  // pointer for result
        int borrow = 0;

        while (j >= 0) {
            int a1 = (i >= 0) ? arr1[i] : 0;
            int a2 = arr2[j] + borrow;

            int diff;

            if (a2 >= a1) {
                diff = a2 - a1;
                borrow = 0;
            } else {
                diff = (a2 + 10) - a1;
                borrow = -1;
            }

            result[k] = diff;

            i--;
            j--;
            k--;
        }

        // Print result (skipping leading 0s)
        System.out.println("Result (arr2 - arr1):");
        boolean leadingZero = true;
        for (int val : result) {
            if (val != 0) {
                leadingZero = false;
            }
            if (!leadingZero) {
                System.out.print(val + " ");
            }
        }

        // If result is 0
        if (leadingZero) {
            System.out.print(0);
        }

        System.out.println();
    }
}
