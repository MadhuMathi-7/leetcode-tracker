// Last updated: 7/9/2026, 9:48:33 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int onesPicked = Math.min(numOnes, k);
        int remainingK = k - onesPicked;
        int zerosPicked = Math.min(numZeros, remainingK);
        remainingK -= zerosPicked;
        int negOnesPicked = Math.min(numNegOnes, remainingK);
        return onesPicked - negOnesPicked;
    }
}
