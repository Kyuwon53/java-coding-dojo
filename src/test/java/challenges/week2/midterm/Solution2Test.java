package _202206.week2.midterm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2Test {

    Solution2 solution = new Solution2();

    @Test
    @DisplayName("일반 손님 사이에 예약 손님이 있는 경우")
    void solution() {
        String[][] booked = new String[][]{{"09:10", "lee"}};
        String[][] unbooked = new String[][]{{"09:00", "kim"}, {"09:05", "bae"}};
        String[] result = new String[]{"kim", "lee", "bae"};
        assertArrayEquals(result, solution.solution(booked, unbooked));
    }

    @Test
    @DisplayName("예약 손님과 일반 손님이 겹치지 않은 경우")
    void solution2() {
        String[][] booked = new String[][]{{"19:10", "lee"}};
        String[][] unbooked = new String[][]{{"09:00", "kim"}, {"09:05", "bae"}};
        String[] result = new String[]{"kim", "bae", "lee"};
        assertArrayEquals(result, solution.solution(booked, unbooked));
    }

    @Test
    @DisplayName("일반 손님이 먼저 왔지만 예약 손님이 우선인 경우")
    void solution3() {
        String[][] booked = new String[][]{{"09:04", "lee"}};
        String[][] unbooked = new String[][]{{"09:00", "kim"}, {"09:05", "bae"}};
        String[] result = new String[]{"lee", "kim", "bae"};
        assertArrayEquals(result, solution.solution(booked, unbooked));

    }
}
