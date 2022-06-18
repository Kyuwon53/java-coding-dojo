package challenges.week1.stations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StationsTest {
    Stations stations = new Stations();

    @Test
    void solution_1() {
        int[] stationsList = new int[]{4, 11};
        assertEquals(3, stations.solution(11, stationsList, 1));
    }
    @Test
    void solution_2() {
        int[] stationsList = new int[]{9};
        assertEquals(3, stations.solution(16, stationsList, 2));
    }
}
