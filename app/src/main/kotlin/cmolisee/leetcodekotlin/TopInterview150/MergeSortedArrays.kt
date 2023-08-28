/**
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 */
// @file:JvmName("MergeSortedArrays")
package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n <= 0 || m + n == 0 ) return

        var i = m - 1
        var j = n - 1
        var k = m + n -1
        while (j >= 0) {
            nums1[k--] = if (i < 0 || nums1[i] < nums2[j]) {
                nums2[j--]
            } else {
                nums1[i--]
            }
        }
    }
}

fun main() {
    var nums1 = intArrayOf(1,3,5,7,9,0,0,0,0,0)
    var nums2 = intArrayOf(2,4,6,8,10)

    println("merge sorted arrays: ${Arrays.toString(nums1)} and ${Arrays.toString(nums2)}");

    Solution().merge(nums1, nums1.size - nums2.size, nums2, nums2.size)
    println("result: ${Arrays.toString(nums1)}")
}