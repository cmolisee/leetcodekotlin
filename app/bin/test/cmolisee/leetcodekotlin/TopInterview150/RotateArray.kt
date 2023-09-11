package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals

class RotateArrayTest {
    @Test fun example1() {
        var nums = intArrayOf(1,2,3,4,5,6,7)
        var k = 3
        val expectedRes = intArrayOf(5,6,7,1,2,3,4)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotate(nums, k)

        assertEquals(expectedRes, nums, "expected: $expectedRes, actual: $nums")
    }

    @Test fun example2() {
        var nums = intArrayOf(-1,-100,3,99)
        var k = 2
        val expectedRes = intArrayOf(3,99,-1,-100)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotate(nums, k)

        assertEquals(expectedRes, nums, "expected: $expectedRes, actual: $nums")
    }

    @Test fun example1B() {
        var nums = intArrayOf(1,2,3,4,5,6,7)
        var k = 3
        val expectedRes = intArrayOf(5,6,7,1,2,3,4)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotateB(nums, k)

        assertEquals(expectedRes, nums, "expected: $expectedRes, actual: $nums")
    }

    @Test fun example2B() {
        var nums = intArrayOf(-1,-100,3,99)
        var k = 2
        val expectedRes = intArrayOf(3,99,-1,-100)

        println("rotate array $k positions to the right: ${Arrays.toString(nums)}")
        SolutionRotateArray().rotateB(nums, k)

        assertEquals(expectedRes, nums, "expected: $expectedRes, actual: $nums")
    }
}
