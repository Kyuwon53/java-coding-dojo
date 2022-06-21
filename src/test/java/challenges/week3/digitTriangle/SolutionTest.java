package challenges.week3.digitTriangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution solution = new Solution();

    @Test
    @DisplayName("5층 삼각형")
    void triangle_5nd_floor() {
        int[][] triangle = {
                {7},
                {3, 8},
                {8, 1, 0},
                {2, 7, 4, 4},
                {4, 5, 2, 6, 5}
        };
        assertEquals(30, solution.solution(triangle));
    }

    @Test
    @DisplayName("3층 삼각형")
    void triangle_3nd_floor() {
        int[][] triangle = {
                {7},
                {3, 8},
        };
        assertEquals(15, solution.solution(triangle));
    }
}
