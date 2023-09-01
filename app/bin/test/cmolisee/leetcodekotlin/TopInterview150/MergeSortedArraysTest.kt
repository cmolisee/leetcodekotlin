package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays
import kotlin.test.Test
import kotlin.test.assertTrue

class MergeSortedArraysTest {
    @Test fun example1() {
        var nums1 = intArrayOf(1,2,3,0,0,0)
        var nums2 = intArrayOf(2,5,6)
        var expected = intArrayOf(1,2,2,3,5,6)

        println("merging sorted arrays: ${Arrays.toString(nums1)} and ${Arrays.toString(nums2)}")

        SolutionMergeSortedArrays().merge(nums1, nums1.size - nums2.size, nums2, nums2.size)
        assertTrue(expected contentEquals nums1, "Expected and nums1 do not match...")
    }

    @Test fun example2() {
        var nums1 = intArrayOf(1)
        var nums2 = intArrayOf()
        var expected = intArrayOf(1)

        println("merging sorted arrays: ${Arrays.toString(nums1)} and ${Arrays.toString(nums2)}")

        SolutionMergeSortedArrays().merge(nums1, nums1.size - nums2.size, nums2, nums2.size)
        assertTrue(expected contentEquals nums1, "Expected and nums1 do not match...")
    }

    @Test fun example3() {
        var nums1 = intArrayOf(0)
        var nums2 = intArrayOf(1)
        var expected = intArrayOf(1)

        println("merging sorted arrays: ${Arrays.toString(nums1)} and ${Arrays.toString(nums2)}")

        SolutionMergeSortedArrays().merge(nums1, nums1.size - nums2.size, nums2, nums2.size)
        assertTrue(expected contentEquals nums1, "Expected and nums1 do not match...")
    }
}
