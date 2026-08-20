import java.util.HashMap;

class Solution {

    private int solve(int[] nums, int target, int index, int sum,
                      HashMap<String, Integer> dp) {

        // Base case
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        // Current state
        String key = index + "," + sum;

        // Return already calculated result
        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        // Choose +
        int add = solve(nums, target, index + 1,
                        sum + nums[index], dp);

        // Choose -
        int subtract = solve(nums, target, index + 1,
                             sum - nums[index], dp);

        // Store result for current state
        int ways = add + subtract;
        dp.put(key, ways);

        return ways;
    }

    public int findTargetSumWays(int[] nums, int target) {

        HashMap<String, Integer> dp = new HashMap<>();

        return solve(nums, target, 0, 0, dp);
    }
}
