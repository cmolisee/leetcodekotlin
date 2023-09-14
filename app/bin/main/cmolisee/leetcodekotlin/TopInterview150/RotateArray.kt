/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/
package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays

class SolutionRotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        if (k == 0 || k == nums.size || nums.size == 1) return
        val n = if (k > nums.size) k % nums.size else k

        println("k is $k, n is $n,")
        nums.reverse(0, nums.size)
        println("1: ${Arrays.toString(nums)}")
        nums.reverse(0, n)
        println("2: ${Arrays.toString(nums)}")
        nums.reverse(n, nums.size)
        println("3: ${Arrays.toString(nums)}")
    }

    // too slow
    // fun rotateB(nums: IntArray, k: Int): Unit {
    //     if (k == 0 || k == nums.size) return

    //     var i = nums.lastIndex
    //     // only shift as many times as necessary
    //     var s = if (k > nums.size) nums.size - nums.size % k else k
    //     var next = nums[i - s]
    //     // move every kth element k indexes to the right starting from last
    //     while (i != nums.lastIndex - s) {
    //         if (i > nums.lastIndex) i -= nums.size
    //         var t = nums[i]
    //         nums[i] = next
    //         next = t
    //         i += s
    //     }

    //     // update the lat untouched element
    //     nums[nums.lastIndex - s] = next
    // }

    // fails on [1,2] k=3
    // fun rotateC(nums:IntArray, k: Int): Unit {
    //     if (k == 0 || k == nums.size) return

    //     val deque = ArrayDeque<Int>()
    //     var i = if (k > nums.size) nums.size - nums.size % k else nums.size - k
    //     while (deque.size < nums.size) {
    //         if (i > nums.lastIndex) i = 0
    //         deque.addLast(nums[i++])
    //     }

    //     deque.forEachIndexed { idx, v -> nums[idx] = v }
    // }
}

fun main() {
    var nums = intArrayOf(1,2,3,4,5,6,7,8)
    var k = 3

    println("rotate array $k positions to the right: ${Arrays.toString(nums)}")

    SolutionRotateArray().rotate(nums, k)
    println("output: ${Arrays.toString(nums)}")
}
