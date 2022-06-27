package programmers.level1.reportResult;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportCount = new int[id_list.length];
        String[] newReport = Arrays.stream(report).distinct().toArray(String[]::new);

        for (String repo : newReport) {
            String target = repo.split(" ")[1];

            int targetIndex = Arrays.asList(id_list).indexOf(target);

            reportCount[targetIndex]++;
        }
        for (String repo : newReport) {
            String reporter = repo.split(" ")[0];
            String target = repo.split(" ")[1];

            int targetIndex = Arrays.asList(id_list).indexOf(target);
            int raporterIndex = Arrays.asList(id_list).indexOf(reporter);

            if (reportCount[targetIndex] >= k) {
                answer[raporterIndex]++;
            }
        }
        return answer;
    }
}
