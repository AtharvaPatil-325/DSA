import java.util.Scanner;

public class sumof2array {

    public static void sum(int array1[], int array2[], int output[]) {
        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = output.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = array1[i] + array2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }

        while (i >= 0) {
            int sum = array1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i--;
            k--;
        }

        while (j >= 0) {
            int sum = array2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            j--;
            k--;
        }

        if (carry > 0) {
            output[k] = carry;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter the size of array1:");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements in array1 (digit by digit):");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.println("Enter the size of array2:");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements in array2 (digit by digit):");
        for (int j = 0; j < size2; j++) {
            array2[j] = sc.nextInt();
        }

        // Prepare output array: max(size1, size2) + 1
        int maxLength = Math.max(size1, size2);
        int[] output = new int[maxLength + 1];  // +1 for possible carry

        // Call sum function
        sum(array1, array2, output);

        // Print result, skipping leading 0 if no carry
        System.out.print("Result is: ");
        boolean leadingZero = output[0] == 0;
        for (int i = (leadingZero ? 1 : 0); i < output.length; i++) {
            System.out.print(output[i]);
        }
        System.out.println();
    }
}
