class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });
        int n = envelopes.length;
        int[] dp = new int[n];
        int omax = 0;

        for(int i = 0; i<n; i++){
            int max = 0;
            for(int j = 0; j<i; j++){
                if(envelopes[j][0] < envelopes[i][0] && envelopes[j][1]<envelopes[i][1]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            omax = Math.max(omax, dp[i]);
        }
        return omax;
    }
}