package challenges.week3.digitTriangle;

public class Solution {
    public int solution(int[][] triangle) {

        int n = triangle.length;

        int[][] sumTriangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            sumTriangle[n - 1][i] = triangle[n - 1][i];
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sumTriangle[i - 1][j] = Math.max(sumTriangle[i][j] + triangle[i - 1][j], sumTriangle[i][j + 1] + triangle[i - 1][j]);
            }
        }

        return sumTriangle[0][0];
    }
}
