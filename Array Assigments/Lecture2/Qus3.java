 
import java.util.HashMap;
import java.util.Map;

public class Qus3 {
   

    public int findLHS(int[] nums) {
        // Create a frequency map to count the occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int longestSubsequence = 0;
        // Iterate over each number in the array
        for (int num : nums) {
            // Check if there exists a number that differs from the current number by 1
            if (frequencyMap.containsKey(num + 1)) {
                int subsequenceLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, subsequenceLength);
            }
        }

        return longestSubsequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
       Qus3 harmoniousArray = new Qus3();
        int longestSubsequence = harmoniousArray.findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequence);
    }
}

