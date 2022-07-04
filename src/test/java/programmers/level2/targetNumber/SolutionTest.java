package programmers.level2.targetNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution solution = new Solution();

    @Test
    void test1() {
        int [] numbers = {1,1,1,1,1};
        int target = 3;
        int result = solution.solution(numbers, target);
        assertEquals(5, result);
    }

    @Test
    void test2() {
        int [] numbers = {4,1,2,1};
        int target = 4;
        int result = solution.solution(numbers, target);
        assertEquals(2, result);
    }

}
