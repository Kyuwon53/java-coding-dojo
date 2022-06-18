package challenges.week1.budget;

import java.util.stream.IntStream;

class Budget {
//    - 여러 지방의 예산요청 금액이 총 예산보다 낮으면 값을 그대로 반환
//- 예산요청 금액이 총 예산보다 높으면 예산의 평균을 상한액으로 잡는다
//- 상한액보다 낮으면 그대로 높으면 상한액을 합산해서 예산이랑 비교한다
//- 예산보다 총 합이 적으면 상한액을 더 높인다.

    // 예산 평균 값을
    public int solution(int[] budgets, int M) {
        int answer = 0;
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);

        while (min <= max) {
            final int mid = (min + max) / 2;
            int sum = sumBudgets(budgets, mid);

            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }
        return answer;
    }

    public int sumBudgets(int[] budgets, int mid) {
        int sum = 0;
        for (int buget : budgets) {
            sum += Math.min(buget, mid);
        }
        return sum;
    }
}
