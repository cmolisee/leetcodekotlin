package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RemoveDuplicates {
    @Test fun example1() {
        var nums = intArrayOf(1,1,2)
        val expectedRes = 2
        var expectedNums = intArrayOf(1,2)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicates().removeDuplicates(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }

    @Test fun example2() {
        var nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val expectedRes = 5
        var expectedNums = intArrayOf(0,1,2,3,4)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicates().removeDuplicates(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }

    @Test fun example3() {
        var nums = intArrayOf(1,1)
        val expectedRes = 1
        var expectedNums = intArrayOf(1)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicates().removeDuplicates(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }
}
