package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertEquals

class MajorityElementTest {
    @Test fun example1() {
        var nums = intArrayOf(3,2,3)
        val expectedRes = 3

        println("finding majority element in ${Arrays.toString(nums)}")
        val res = SolutionMMajorityElement().majorityElement(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }

    @Test fun example2() {
        var nums = intArrayOf(2,2,1,1,1,2,2)
        val expectedRes = 2

        println("finding majority element in ${Arrays.toString(nums)}")
        val res = SolutionMMajorityElement().majorityElement(nums)

        assertEquals(expectedRes, res, "expected: $expectedRes, actual: $res")
    }
}
