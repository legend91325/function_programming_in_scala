package com.code.array.twoSum

/**
 * @Auther: WuKong
 * @Date: 2022/11/2 17:07
 * @Description:
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val nums = Array(2,7,11,5)
    val twoSumArray = twoSum(nums, 9)
    println(nums(twoSumArray(0))+"+"+ nums(twoSumArray(1)))
  }
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for(index<-0 until nums.length) {
      val minTarget = target-nums(index)
      for(nestIndex<-index+1 until nums.length)
        if(nums(nestIndex)==minTarget)
          return Array(index,nestIndex)
    }
    Array(0,0)

  }
}