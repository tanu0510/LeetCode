class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(0, s, dp);
    }

    public int helper(int i, String s, int[] dp) {
        if (i == s.length()) return 1;      // decoded the whole string
        if (s.charAt(i) == '0') return 0;   // '0' can't start a decoding

        if (dp[i] != -1) return dp[i];

        int one = helper(i + 1, s, dp);     // take one digit

        int two = 0;
        if (i + 1 < s.length()) {
            int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
            if (num <= 26) two = helper(i + 2, s, dp); // take two digits
        }

        return dp[i] = one + two;
    }
}