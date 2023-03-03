package com.code.design.shuffleArray

import java.util.Random

/**
 * @Auther: WuKong
 * @Date: 2023/3/3 16:21
 * @Description:
 */
class Solution(_nums: Array[Int]) {

  def reset(): Array[Int] = {
    _nums
  }

  def shuffle(): Array[Int] = {
    val random = new Random()
    val nums = _nums.clone()
    for (i <- nums.length - 1 to 1 by -1) {
      val j = random.nextInt(i + 1)
      val temp = nums(i)
      nums(i) = nums(j)
      nums(j) = temp
    }
    nums
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = new Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */

