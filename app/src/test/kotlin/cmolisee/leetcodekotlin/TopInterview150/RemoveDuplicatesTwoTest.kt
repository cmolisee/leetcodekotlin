package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RemoveDuplicatesTwoTest {
    @Test fun example1() {
        var nums = intArrayOf(1,1,1,2,2,3)
        val expectedRes = 5
        var expectedNums = intArrayOf(1,1,2,2,3)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicatesTwo().removeDuplicates(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }

    @Test fun example2() {
        var nums = intArrayOf(0,0,1,1,1,1,2,3,3)
        val expectedRes = 7
        var expectedNums = intArrayOf(0,0,1,1,2,3,3)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicatesTwo().removeDuplicates(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }

    @Test fun example1B() {
        var nums = intArrayOf(1,1,1,2,2,3)
        val expectedRes = 5
        var expectedNums = intArrayOf(1,1,2,2,3)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicatesTwo().removeDuplicatesB(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }

    @Test fun example2B() {
        var nums = intArrayOf(0,0,1,1,1,1,2,3,3)
        val expectedRes = 7
        var expectedNums = intArrayOf(0,0,1,1,2,3,3)

        println("removing duplicates from ${Arrays.toString(nums)}")
        val res = SolutionRemoveDuplicatesTwo().removeDuplicatesB(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }
}
