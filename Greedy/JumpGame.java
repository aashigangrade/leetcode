/*
The provided solution uses a greedy approach to determine if it's possible to reach the last index in the given array. The algorithm iterates through the array, updating a variable reachable to store the furthest index that can be reached from the current position. If at any point, the current index exceeds the reachable value, it means the last index cannot be reached, and the algorithm returns false. If the reachable value is greater than or equal to the last index, the algorithm returns true.

The code complexity for this solution is as follows:

Time Complexity: O(N), where N is the length of the input array nums. The algorithm iterates through the array once.
Space Complexity: O(1), as the algorithm uses a constant amount of extra space for variables, regardless of the input size.

*/

class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
            if (reachable >= nums.length - 1) return true;
        }
        return true;
    }
}