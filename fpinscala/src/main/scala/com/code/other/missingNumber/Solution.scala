package com.code.other.missingNumber

/**
 * @Auther: WuKong
 * @Date: 2023/3/21 13:33
 * @Description:
 */
object Solution {
  def missingNumber(nums: Array[Int]): Int = {
    var xor = 0
    for(i <- 0 until nums.length)
      xor ^= nums(i) ^ i
    xor ^= nums.length
    xor
  }
}

