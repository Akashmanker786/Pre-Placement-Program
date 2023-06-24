import java.util.Arrays;
public class SetMisMatch {
    



    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        Arrays.sort(nums);

        int duplicate = -1;
        int missing = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }

        // Check if the missing number is at the beginning or end of the array
        if (nums[n - 1] != n) {
            missing = n;
        }

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }

    public static void main(String[] args) {
                int[] nums = {1, 2, 2, 4};

        int[] result = findErrorNums(nums);

        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

