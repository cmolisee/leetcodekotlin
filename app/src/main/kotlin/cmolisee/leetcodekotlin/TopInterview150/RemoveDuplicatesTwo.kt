/**
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
 assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:
1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */
package cmolisee.leetcodekotlin.TopInterview150

import java.util.Arrays

class SolutionRemoveDuplicatesTwo {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size < 3) return nums.size

        // start window from index 1,2
        var i = 1
        for (k in 2 until nums.size) {
            // first condition checks the first and last index of the window
            // second contdition ensures duplicates always move 2 spaces
            // both conditions together ensure max of 2 duplicate values
            if ((nums[k] != nums[i] || nums[k] != nums[i - 1])) {
                // replace the duplicate with the first non-duplicate
                nums[++i] = nums[k]
            }
        }

        // increment index i to account for actual size
        return i + 1
    }

    /*
    Another solution would be to start a window of size 1 at index 2.
    Compare the last index of the window to second previous index of the first window index
        (i.e. window first index - 2).
    If they are not equal then replace the first index of the window with the non-duplicate at the
        last index of the window and step the first index forward.

    This will create a window around duplicates instead of creating a window around non-duplicates. In
    otherwords the window will grow to encase all non-duplicates and it will systematically shift them
    to the end of the array.

    This particular solution is a bit more efficient than above
     */
    fun removeDuplicatesB(nums: IntArray): Int {
        if (nums.size < 3) return nums.size

        var k = 2
        for (i in 2 until nums.size) {
            if (nums[i] != nums[k - 2]) {
                nums[k++] = nums[i]
            }
        }

        return k
    }
}

fun main() {
    var nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)

    println("removing duplicates from ${Arrays.toString(nums)}")

    val res = SolutionRemoveDuplicatesTwo().removeDuplicates(nums)
    println("output: $res, ${Arrays.toString(nums)}")
}
