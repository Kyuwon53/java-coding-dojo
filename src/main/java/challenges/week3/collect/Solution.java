package challenges.week3.collect;
/*
class Solution {
    int count;

    public int solution(int n) {
        count = 0;
        dfs(0, 0, n);
        return count;
    }

    public void dfs(int left, int right, int n) {
        if (left < right) {
            return;
        }
        if (left > n || right > n) {
            return;
        }
        if (left == n && right == n) {
            count++;
            return;
        }
        System.out.println("count : " + count + " left : " + left + " right: " + right);
        dfs(left + 1, right, n);
        dfs(left, right + 1, n);
    }
}*/

import java.util.*;
class Solution {
    private static int count = 0;

    public int solution(int n) {
        Make(n, 0, 0);

        return count;
    }

    static void Make(int n, int left, int right) {
        if (left == n && right == n) {
            count++;
            return;
        }

        if (left == right) {
            Make(n, left + 1, right);
        } else if (left == n) {
            Make(n, left, right + 1);
        } else {
            Make(n, left + 1, right);
            Make(n, left, right + 1);
        }
    }
}
