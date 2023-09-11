/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/
package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays

class SolutionMMajorityElement {
    fun majorityElement(nums: IntArray): Int {
        if (nums.size < 3) return nums[0]

        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1)
            } else {
                var v = map.getValue(nums[i]) + 1
                if (v > (nums.size / 2)) return nums[i]
                map.set(nums[i], v)
            }
        }

        return -1
    }
}

fun main() {
    var nums = intArrayOf(1,0,1,5,9,9,0,0,0,0,0)

    println("Find majority element in: ${Arrays.toString(nums)}")

    var res = SolutionMMajorityElement().majorityElement(nums)
    println("output: $res, ${Arrays.toString(nums)}")
}
