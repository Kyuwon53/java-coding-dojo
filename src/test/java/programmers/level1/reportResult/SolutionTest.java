package programmers.level1.reportResult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution solution = new Solution();

    @Test
    void test() {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = {2, 1, 1, 0};
        assertEquals(result, solution.solution(idList, report, k));
//        assertEquals(new int[] {1,2,0,2}, solution.solution(idList, report, k));
    }
}
