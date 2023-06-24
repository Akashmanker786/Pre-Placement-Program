public class Qus7 {
    

    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        // Check if the array is monotone increasing or monotone decreasing
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
        }

        // Return true if the array is monotonic (either increasing or decreasing)
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        Qus7 monotonicArray = new Qus7();
        boolean isMonotonic = monotonicArray.isMonotonic(nums);
        System.out.println("Is the array monotonic? " + isMonotonic);
    }
}

