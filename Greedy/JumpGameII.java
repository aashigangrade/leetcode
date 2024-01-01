class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}

This algorithm uses a greedy approach to find the minimum number of jumps. It iterates through the array, updating the farthest reachable index and tracking the current range of indices that can be reached with the current number of jumps. Whenever the current range is exhausted, it increments the number of jumps and updates the current range to the farthest reachable index.

This solution has a time complexity of O(N) and a space complexity of O(1), where N is the length of the input array nums.






