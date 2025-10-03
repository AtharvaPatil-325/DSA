public class eo {
    public static void main(String[] args) {
        int num = 1234;   // number to check
        int even_count = 0, odd_count = 0;

        while (num != 0) {
            int digit = num % 10;   // extract last digit
            if (digit % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            num = num / 10;   // remove last digit
        }

        System.out.println("Even digits: " + even_count);
        System.out.println("Odd digits: " + odd_count);
    }
}
