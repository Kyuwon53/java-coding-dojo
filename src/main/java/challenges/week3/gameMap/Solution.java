package challenges.week3.gameMap;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {

        return bfs(0, 0, maps);
    }

    public int bfs(int x, int y, int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        Queue<Node> queue = new LinkedList<Node>();

        queue.offer(new Node(x, y, 1));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.x == n - 1 && node.y == m - 1) {
                return node.cost;
            }

            for (int i = 0; i < 4; i++) {
                int nodeX = node.x + dx[i];
                int nodeY = node.y + dy[i];
                // 범위가 벗어난 경우
                if (nodeX < 0 || nodeY < 0 || nodeX >= n || nodeY >= m) {
                    continue;
                }
                // 벽인 경우
                if (maps[nodeX][nodeY] == 0) {
                    continue;
                }
                if (maps[nodeX][nodeY] == 1) {
                    queue.offer(new Node(nodeX, nodeY, node.cost + 1));
                }
                maps[nodeX][nodeY] = 0;
            }
        }
        return -1;

    }

    public class Node {
        int x;
        int y;
        int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}
