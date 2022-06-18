package challenges.week3.camouflage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    final Solution solution = new Solution();
    String[][] clothes1 = new String[][]{{"yellowhat", "headgear"},
            {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

    String[][] clothes2 = new String[][]{{"crowmask", "face"},
            {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

    @Test
    @DisplayName("의상의 종류가 다르고 의상이 여러개인 경우")
    void different_clothes() {
        assertEquals(5, solution.solution(clothes1));
    }

    @Test
    @DisplayName("의상의 종류가 한 가지인 경우")
    void clothes_one() {
        assertEquals(3, solution.solution(clothes2));
    }

    @Test
    void test_hash() {
        HashMap<String, Integer> hashMap = solution.setHashMap(clothes1);
        HashMap<String, Integer> hashMap2 = solution.setHashMap(clothes2);
        assertEquals(2,hashMap.get("headgear"));
        assertEquals(1,hashMap.get("eyewear"));
        assertEquals(3,hashMap2.get("face"));
    }
}
