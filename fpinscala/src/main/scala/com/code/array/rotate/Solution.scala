package com.code.array.rotate

/**
 * @Auther: WuKong
 * @Date: 2022/10/26 14:26
 * @Description:
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val nums = Array(1, 2, 3, 4, 5, 6, 7)
    val rotateNums = rotate(nums,3)
    println(rotateNums.mkString(","))
  }
  /**
   * @param nums
   * @param k
   */
  def rotate(nums: Array[Int], k: Int): Array[Int] = {
    val rotateNum = k % nums.length
    if (rotateNum==0 || nums.length==1)
      nums
    else
      nums.drop(nums.length-rotateNum)++nums.take(nums.length-rotateNum)
  }
}
