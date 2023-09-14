package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals

class MaxProfitTwoTest {
    @Test fun example1() {
        var prices = intArrayOf(7,1,5,3,6,4)
        val expectedRes = 7

        println("calculate max profit in ${Arrays.toString(prices)}")
        val res = SolutionMaxProfitTwo().maxProfit(prices)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }

    @Test fun example2() {
        var prices = intArrayOf(1,2,3,4,5)
        val expectedRes = 4

        println("calculate max profit in ${Arrays.toString(prices)}")
        val res = SolutionMaxProfitTwo().maxProfit(prices)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }

    @Test fun example1B() {
        var prices = intArrayOf(7,1,5,3,6,4)
        val expectedRes = 7

        println("calculate max profit in ${Arrays.toString(prices)}")
        val res = SolutionMaxProfitTwo().maxProfitB(prices)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }

    @Test fun example2B() {
        var prices = intArrayOf(1,2,3,4,5)
        val expectedRes = 4

        println("calculate max profit in ${Arrays.toString(prices)}")
        val res = SolutionMaxProfitTwo().maxProfitB(prices)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }
}