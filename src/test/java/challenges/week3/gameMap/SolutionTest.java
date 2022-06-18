package challenges.week3.gameMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution solution = new Solution();

    @Test
    @DisplayName("2가지의 길이 있는 경우")
    void two_ways() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};
        assertEquals(11, solution.solution(maps));
    }

    @Test
    @DisplayName("길이 없는 경우")
    void no_ways() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}};
//        assertEquals(-1, solution.solution(maps));
    }

}
