package com.code.array.containsDuplicate

/**
 * @Auther: WuKong
 * @Date: 2022/10/27 09:41
 * @Description:
 */
object Solution {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.distinct.length == nums.length
  }
}
