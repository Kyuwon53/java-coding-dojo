import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] targets = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            targets[i] = numbers[i] + "";
        }
        Arrays.sort(targets, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));

        return targets[0].equals("0") ? "0" : Arrays.stream(targets).collect(Collectors.joining());
    }
}
