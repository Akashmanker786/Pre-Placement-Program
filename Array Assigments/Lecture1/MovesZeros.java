public class MovesZeros {
    

    public static void moveZeroes(int[] nums) {
        int i = 0; // Index for non-zero elements

        // Move all non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        // Fill the remaining positions with zeroes
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

