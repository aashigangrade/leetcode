DP for Beginners [Problems | Patterns | Sample Solutions]

- The order of solving a dp problem should be 1) come up with a recurrence relation first 2) code it up. The first part only needs a pen and paper.

- When coming up with a recurrence relation, separately come up with a general case and base cases.
- **2.1 when coming up with a general case, assign well defined English meaning to your dp term, dp[...][...][...]... e.g. for https://leetcode.com/problems/longest-increasing-subsequence/, dp[i] = the length of the longest increasing subsequence that ENDS on element i.
- **2.2 once you define your meaning, express the answer to the original problem in terms of your dp terms. If you can't do this, then it means your dp definition likely lacks certain necessary information. e.g. for longest increasing subsequence, ans == max(dp[i]) for 0 <= i < n, n == length of an input array (because you don't know where an optimal solution ends)
- **2.3 base cases are usually straightforwardly defined if you follow the top-down approach. i.e. the conditions in which your recursive function ends. If your recursive function is stuck in an infinite loop, you are probably missing a base case (though it is possible your general case is messed up and creates a cycle. see my point 4)

- People usually prefer either the top-down or the bottom-up style. Stick with one or the other and always code in some template. Then, writing code is a matter of translating your recurrence relation. This way, you avoid mistakes.

- At its core, DP problems are really graph problems. Here each dp[...][...][...] terms are nodes and edges are drawn based on recurrence relations. For your problem to have a DP solution, this graph MUST BE a DAG. This is usually what textbooks mean "optimal substructure". For me, this connection of DP to its graph representation greatly helped.

- Once you "get" the solid understanding, then solve problems to find and internalize common patterns.

--------------
Full problem list: https://leetcode.com/list/x1k8lxi5

Longest Increasing Subsequence variants:
https://leetcode.com/problems/longest-increasing-subsequence/
https://leetcode.com/problems/largest-divisible-subset/
https://leetcode.com/problems/russian-doll-envelopes/
https://leetcode.com/problems/maximum-length-of-pair-chain/
https://leetcode.com/problems/number-of-longest-increasing-subsequence/
https://leetcode.com/problems/delete-and-earn/
https://leetcode.com/problems/longest-string-chain/

Partition Subset:
https://leetcode.com/problems/partition-equal-subset-sum/
https://leetcode.com/problems/last-stone-weight-ii/

BitMasking:
https://leetcode.com/problems/partition-to-k-equal-sum-subsets/

Longest Common Subsequence Variant:
https://leetcode.com/problems/longest-common-subsequence/
https://leetcode.com/problems/edit-distance/
https://leetcode.com/problems/distinct-subsequences/
https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/

Palindrome:
https://leetcode.com/problems/palindrome-partitioning-ii/
https://leetcode.com/problems/palindromic-substrings/

Coin Change variant:
https://leetcode.com/problems/coin-change/
https://leetcode.com/problems/coin-change-2/
https://leetcode.com/problems/combination-sum-iv/
https://leetcode.com/problems/perfect-squares/
https://leetcode.com/problems/minimum-cost-for-tickets/

Matrix multiplication variant:
https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/
https://leetcode.com/problems/burst-balloons/

Matrix/2D Array:
https://leetcode.com/problems/matrix-block-sum/
https://leetcode.com/problems/range-sum-query-2d-immutable/
https://leetcode.com/problems/dungeon-game/
https://leetcode.com/problems/triangle/
https://leetcode.com/problems/maximal-square/
https://leetcode.com/problems/minimum-falling-path-sum/

Hash + DP:
https://leetcode.com/problems/target-sum/
https://leetcode.com/problems/longest-arithmetic-sequence/
https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/

State machine:
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/

Depth First Search + DP:
https://leetcode.com/problems/out-of-boundary-paths/
https://leetcode.com/problems/knight-probability-in-chessboard/

Minimax DP:
https://leetcode.com/problems/predict-the-winner/
https://leetcode.com/problems/stone-game/

Misc:
https://leetcode.com/problems/greatest-sum-divisible-by-three/
https://leetcode.com/problems/decode-ways/
https://leetcode.com/problems/perfect-squares/
https://leetcode.com/problems/count-numbers-with-unique-digits/
https://leetcode.com/problems/longest-turbulent-subarray/
https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/

