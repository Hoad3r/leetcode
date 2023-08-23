import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // initialize empty
        for (int i = 0; i < nums.length; ++i) {
            int complement = target - nums[i]; // catch the other pair for the target
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)}; // get the complement key and value
                // if the not contain the number is added to hashmap
            }
            // associate the key (nums[i]) with the value (i)
            map.put(nums[i], i);
        }
        return null; // No pair exists
    }
}
