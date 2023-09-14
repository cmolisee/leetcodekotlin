/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104
*/
package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays

class SolutionMaxProfit {
    fun maxProfit(prices: IntArray): Int {
        var p = 0
        var m = prices[0]
        for (i in 1 until prices.size) {
            if (prices[i] > m) {
                p = maxOf(prices[i] - m, p)
            } else {
                m = prices[i]
            }
        }
        
        return p
    }
}

fun main() {
    var prices = intArrayOf(7,1,5,3,4,6)

    println("find max profit of ${Arrays.toString(prices)}")

    var res = SolutionMaxProfit().maxProfit(prices)
    println("output: $res, ${Arrays.toString(prices)}")
}
