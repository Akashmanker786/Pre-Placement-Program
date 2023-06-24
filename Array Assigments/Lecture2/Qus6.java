public class Qus6 {
    

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is found at the middle index
            if (nums[mid] == target) {
                return mid;
            }

            // If the target is smaller, search the left half of the array
            if (nums[mid] > target) {
                right = mid - 1;
            }
            // If the target is larger, search the right half of the array
            else {
                left = mid + 1;
            }
        }

        // Target is not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Qus6 binarySearch = new Qus6();
        int index = binarySearch.search(nums, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}

