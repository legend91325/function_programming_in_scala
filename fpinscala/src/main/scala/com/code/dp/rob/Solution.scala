package com.code.dp.rob

/**
 * @Auther: WuKong
 * @Date: 2023/3/3 15:50
 * @Description:
 */
object Solution {
  def rob(nums: Array[Int]): Int = {
    val dp = Array.ofDim[Int](nums.length,2)
    dp(0)(0) = 0
    dp(0)(1) = nums(0)
    for(i <- 1 until nums.length){
      dp(i)(0) = Math.max(dp(i-1)(1),dp(i-1)(0))
      dp(i)(1) = dp(i-1)(0)+nums(i)
    }
    Math.max(dp(nums.length-1)(0),dp(nums.length-1)(1))
  }
}
