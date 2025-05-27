/*Algorithm 
Define a function coinChange(coins[], amount) that returns the minimum number 
Base Cases:
If amount == 0: Return 0 (no coins needed).
If amount < 0: Return -1 (not a valid case).

Initialize a variable minCoins = Integer.MAX_VALUE to  track the minimum coins for amount.

use loop for coins[] array:
For each coin, recursively call the function: result = coinChange(coins, amount - coin).
If result >= 0 and result + 1 < minCoins, update
minCoins = result + 1.
Return the result:
If minCoins is infinite then No valid combination found → return -1.
Else, return minCoins. */
public class q4CoinChangeProblem {

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, amount - coin);
            if (res >= 0 && res < minCoins) {
                minCoins = res + 1;
            }
        }
        return (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
//TC=O(n^amount)
