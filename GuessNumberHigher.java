//Problem Name: Guess Number Higher or Lower
//Problem Link: https://leetcode.com/problems/guess-number-higher-or-lower/description/?envType=study-plan&id=binary-search-i
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= n) {
            int mid = left + (right - left) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            }
            else if (g == 1) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
