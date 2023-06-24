public class PlusOne {
    

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the digits array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the current digit is 9, set it to 0 and continue iterating
            digits[i] = 0;
        }

        // If all digits are 9, create a new array with length n+1
        int[] result = new int[n + 1];
        result[0] = 1; // Set the most significant digit to 1

        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        System.out.print("Output: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}

