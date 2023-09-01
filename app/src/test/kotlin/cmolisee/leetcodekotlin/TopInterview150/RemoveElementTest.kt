package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RemoveElementTest {
    @Test fun example1() {
        var nums = intArrayOf(3,2,2,3)
        var `val` = 3
        val expectedRes = 2
        var expectedNums = intArrayOf(2,2)

        println("removing ${`val`} from ${Arrays.toString(nums)}")
        val res = SolutionRemoveElement().removeElement(nums, `val`)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }

    @Test fun example2() {
        var nums = intArrayOf(0,1,2,2,3,0,4,2)
        var `val` = 2
        val expectedRes = 5
        var expectedNums = intArrayOf(0,1,3,0,4)

        println("removing ${`val`} from ${Arrays.toString(nums)}")
        val res = SolutionRemoveElement().removeElement(nums, `val`)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
        assertTrue(expectedNums contentEquals nums.copyOfRange(0,res), "expected: ${Arrays.toString(expectedNums)}, actual: ${Arrays.toString(nums.copyOfRange(0,res))}")
    }
}
