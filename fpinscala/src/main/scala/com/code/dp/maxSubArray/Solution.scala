package com.code.dp.maxSubArray

/**
 * @Auther: WuKong
 * @Date: 2023/3/3 15:12
 * @Description:
 */
object Solution {
  /**
   * 最大子序和
   * dp[i] 代表以第i个元素结尾的最大子序和
   * @param nums
   * @return
   */
  def maxSubArray(nums: Array[Int]): Int = {
    if(nums.length<2){
      return nums(0)
    }
    val dp = Array.ofDim[Int](nums.length)
    dp(0) = nums(0)
    for (i <- 1 until nums.length) {
      dp(i) = Math.max(dp(i - 1), 0) + nums(i)
    }
    var maxSubMax = dp(0)
    for (i <- 1 until nums.length) {
      if (dp(i) > maxSubMax) {
        maxSubMax = dp(i)
      }
    }
    maxSubMax
  }
}
