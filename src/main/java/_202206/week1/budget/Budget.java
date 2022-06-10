package _202206.week1.budget;

import java.util.Arrays;

class Budget {
//    - 여러 지방의 예산요청 금액이 총 예산보다 낮으면 값을 그대로 반환
//- 예산요청 금액이 총 예산보다 높으면 예산의 평균을 상한액으로 잡는다
//- 상한액보다 낮으면 그대로 높으면 상한액을 합산해서 예산이랑 비교한다
//- 예산보다 총 합이 적으면 상한액을 더 높인다.

    // 예산 평균 값을
    public int solution(int[] budgets, int M) {
        int answer = 0;
        Arrays.sort(budgets);

        int sum = sumBudgets(budgets);
        int min = 0;
        int max = M;
        int mid = 0;
        int premid = 0;
        int length = budgets.length;

        if (sum < M) {
            answer = budgets[length - 1];
        } else {
            while (true) {
                sum = 0;
                mid = (max + min) / length;

                if (mid == premid) {
                    break;
                }
                for (int i = 0; i < length; i++) {
                    if (mid <= budgets[i]) {
                        sum += mid * (length - i);
                        break;
                    } else {
                        sum += budgets[i];
                    }
                }

                if (sum <= M) {
                    min = mid;
                } else {
                    max = mid;
                }
                premid = mid;
            }
            answer = mid;
        }
        return answer;
    }

    private int newBugets(int[] budgets, int average) {
        int sum = 0;
        for (int budget : budgets) {
            if (budget <= average) {
                sum += budget;
            } else {
                sum += average;
            }
        }
        return sum;
    }

    public long sumBudgets(int[] budgets) {
        long sum = 0;
        for (int buget : budgets) {
            sum += buget;
        }
        return sum;
    }
}
