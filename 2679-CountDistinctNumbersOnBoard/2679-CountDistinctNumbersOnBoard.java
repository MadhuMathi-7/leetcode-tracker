// Last updated: 7/9/2026, 9:48:38 AM
class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) return 1;
        Set<Integer> board = new HashSet<>();
        board.add(n);
        int prevSize = 0;
        while (board.size() != prevSize) {
            prevSize = board.size();
            Set<Integer> newNumbers = new HashSet<>();
            for (int x : board) {
                for (int i = 1; i <= n; i++) {
                    if (x % i == 1) {
                        newNumbers.add(i);
                    }
                }
            }
            board.addAll(newNumbers);
        }
        return board.size();
    }
}
