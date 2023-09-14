package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxProfitTest {
    @Test fun example1() {
        var prices = intArrayOf(7,1,5,3,6,4)
        val expectedRes = 5

        println("calculate max profit in ${Arrays.toString(prices)}")
        val res = SolutionMaxProfit().maxProfit(prices)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }

    @Test fun example2() {
        var prices = intArrayOf(8,7,6,5,4,3,2,1)
        val expectedRes = 0

        println("calculate max profit in ${Arrays.toString(prices)}")
        val res = SolutionMaxProfit().maxProfit(prices)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }
}