package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class JumpGameTest {
    @Test fun example1() {
        var nums = intArrayOf(2,3,1,1,4)

        println("can we reach the end of ${Arrays.toString(nums)}")

        assertTrue(SolutionJumpGame().canJump(nums), "expected true but false")
    }

    @Test fun example2() {
        var nums = intArrayOf(3,2,1,0,4)

        println("can we reach the end of ${Arrays.toString(nums)}")

        assertFalse(SolutionJumpGame().canJump(nums), "expected false but true")
    }
}