import java.util.Arrays;
public class Qus8 {
    


    public int minimumScore(int[] nums, int k) {
        int n = nums.length;

        // Sort the array to find the minimum and maximum elements
        Arrays.sort(nums);

        // Initialize the minimum score as the difference between the maximum and minimum elements
        int minScore = nums[n - 1] - nums[0];

        // Iterate over each index i up to k positions from the left and k positions from the right
        for (int i = 0; i < k; i++) {
            // Calculate the score if the element at index i is increased by x
            int score1 = Math.max(nums[i] + k, nums[n - k - 1]) - Math.min(nums[i] + k, nums[n - k - 1]);
            // Calculate the score if the element at index n - 1 - i is decreased by x
            int score2 = Math.max(nums[i], nums[n - k - 1] - k) - Math.min(nums[i], nums[n - k - 1] - k);

            // Update the minimum score
            minScore = Math.min(minScore, Math.min(score1, score2));
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        Qus8 minimumScore = new  Qus8();
        int minScore = minimumScore.minimumScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}

