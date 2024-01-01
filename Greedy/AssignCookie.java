class Solution {
    public int findContentChildren(int[] greedFactors, int[] cookieSizes) {
        Arrays.sort(greedFactors);
        Arrays.sort(cookieSizes);

        int contentChildren = 0;
        int childIndex = 0;

        for (int cookieIndex = 0; childIndex < greedFactors.length && cookieIndex < cookieSizes.length; cookieIndex++) {
            if (cookieSizes[cookieIndex] >= greedFactors[childIndex]) {
                contentChildren++;
                childIndex++;
            }
        }

        return contentChildren;
    }
}

/*

Code Complexity
Time Complexity: O(max(N log N, M log M)), where N is the length of the greed factors array and M is the length of the sizes array. This is due to the sorting of both arrays.
Space Complexity: O(1), as the algorithm uses a constant amount of extra space for variables.

*/