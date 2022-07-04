package programmers.level2.targetNumber;

import java.util.Arrays;

class Solution {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        int sum = Arrays.stream(numbers).sum();
        int remainder = (sum - target) / 2;
        return dfs(0, numbers, 0, remainder);
    }

    public int dfs(int index, int[] numbers, int count, int target) {
        for (int i = index; i < numbers.length; i++) {
            int temp = target;
            temp -= numbers[i];
            if (temp == 0) {
                count++;
            }
            if (temp > 0) {
                count += dfs(i + 1, numbers, 0, temp);
            }
        }
        return count;
    }
}
