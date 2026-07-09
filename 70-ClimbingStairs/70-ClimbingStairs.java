// Last updated: 7/9/2026, 9:52:22 AM
class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int a = 1, b = 2, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b; // f(n) = f(n-1) + f(n-2)
            a = b;
            b = c;
        }
        return b;
    }
}