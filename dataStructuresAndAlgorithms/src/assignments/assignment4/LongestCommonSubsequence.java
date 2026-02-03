package assignments.assignment4;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        LongestCommonSubsequence obj = new LongestCommonSubsequence();

        String s1 = "adbecf", s2 = "haibcg";
        String ans = obj.getSubsequence(s1, s2);
        System.out.println(ans);
    }

    private String getSubsequence(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int r = n1, c = n2;

        while (r > 0 && c > 0) {
            if (dp[r][c] == dp[r - 1][c]) {
                r--;
            } else if (dp[r][c] == dp[r][c - 1]) {
                c--;
            } else {
                ans.append(s1.charAt(r - 1));
                r--;
                c--;
            }
        }

        return ans.reverse().toString();
    }

}
