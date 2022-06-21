package _202206.week2.midterm;

import java.util.ArrayList;
import java.util.Arrays;

class Solution1 {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        int peopleIndex = 0;
        int tshirtsIndex = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        while (peopleIndex < people.length && tshirtsIndex < tshirts.length) {
            if (people[peopleIndex] <= tshirts[tshirtsIndex]) {
                peopleIndex++;
                answer++;
            }
            tshirtsIndex++;
        }
        return answer;
    }
}
