package challenges.week1.bigNumber;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class BigNumber {
    public String solution(int[] numbers) {
        String answer = "";
        String[] targets = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            targets[i] = numbers[i] + "";
        }
        Arrays.sort(targets, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));

        return targets[0].equals("0") ? "0" : Arrays.stream(targets).collect(Collectors.joining());
    }

    public String solution2(int[] numbers) {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }
}
