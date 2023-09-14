package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertTrue

class RotateArrayTest {
    @Test fun example1() {
        var nums = intArrayOf(1,2,3,4,5,6,7)
        var k = 3
        val expectedRes = intArrayOf(5,6,7,1,2,3,4)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotate(nums, k)

        assertTrue(expectedRes contentEquals nums, "expected: ${Arrays.toString(expectedRes)}, actual: ${Arrays.toString(nums)}")
    }

    @Test fun example2() {
        var nums = intArrayOf(-1,-100,3,99)
        var k = 2
        val expectedRes = intArrayOf(3,99,-1,-100)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotate(nums, k)

        assertTrue(expectedRes contentEquals nums, "expected: ${Arrays.toString(expectedRes)}, actual: ${Arrays.toString(nums)}")
    }

    @Test fun example3() {
        var nums = intArrayOf(1,2)
        var k = 3
        val expectedRes = intArrayOf(2,1)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotate(nums, k)

        assertTrue(expectedRes contentEquals nums, "expected: ${Arrays.toString(expectedRes)}, actual: ${Arrays.toString(nums)}")
    }
}
