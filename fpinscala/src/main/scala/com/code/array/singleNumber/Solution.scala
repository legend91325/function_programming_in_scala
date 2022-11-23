package com.code.array.singleNumber

/**
 * @Auther: WuKong
 * @Date: 2022/10/27 15:23
 * @Description:
 */
object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    var result = 0
    for(index <- 0 until (nums.length)) result = result ^ nums(index)
    result
  }
}
