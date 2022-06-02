class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int startPoint = 1;
        int waveRange = 2 * w + 1;
        for (int station : stations) {
            int endPoint = station - w;
            answer += countBaseStation(startPoint, endPoint, waveRange);
            startPoint = endPoint + waveRange;
        }

        if(startPoint <= n){
            answer += countBaseStation(startPoint, n + 1, waveRange);
        }

        return answer;
    }

    private int countBaseStation(int startPoint, int endPoint, int waveRange) {
        int range = endPoint - startPoint;
        if(endPoint <= 0 || range < 0) {
            return 0;
        }
        int count = (int)(range/waveRange);
        int baseStation = (range % waveRange) == 0 ?  count : count + 1;

        return baseStation;
    }
}
