package _202206.week2.midterm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution1 solution = new Solution1();

    @Test
    @DisplayName("사람수가 티셔츠수보다 적을 때 ")
    void solution1() {
        int[] people = new int[]{2, 3};
        int[] tshirts = new int[]{1, 2, 3};
        assertEquals(2, solution.solution(people, tshirts));
    }

    @Test
    @DisplayName("사람수가 티셔츠수보다 많을 때 ")
    void solution2() {
        int[] people = new int[]{1, 1, 2};
        int[] tshirts = new int[]{1, 2};
        assertEquals(2, solution.solution(people, tshirts));
    }

    @Test
    @DisplayName("티셔츠 사이즈가 중복일 때 ")
    void solution3() {
        int[] people = new int[]{1, 2, 3};
        int[] tshirts = new int[]{1, 1};
        assertEquals(1, solution.solution(people, tshirts));
    }

    @Test
    @DisplayName("사람 사이즈가 중복일 때 ")
    void solution4() {
        int[] people = new int[]{1, 2, 1};
        int[] tshirts = new int[]{1, 2, 3, 1};
        assertEquals(3, solution.solution(people, tshirts));
    }

    @Test
    @DisplayName("사이즈가 큰거 밖에 없을 때")
    void solution5() {
        int[] people = new int[]{1, 2, 1};
        int[] tshirts = new int[]{5, 4, 3, 3};
        assertEquals(3, solution.solution(people, tshirts));
    }

    @Test
    @DisplayName("사람 수보다 티셔츠 수가 부족할 때")
    void solution6() {
        int[] people = new int[]{7, 6, 4, 4, 3, 3, 2, 1, 1};
        int[] tshirts = new int[]{5, 4, 3, 3};
        assertEquals(4, solution.solution(people, tshirts));
    }
}
