package challenges.week3.collect;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("2일 경우")
    void test_2() {
        assertEquals(2,solution.solution(2));
    }
    @Test
    @DisplayName("3일 경우")
    void test_3() {
        assertEquals(5,solution.solution(3));
    }
}
