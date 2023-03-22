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
  def rotate1(nums: Array[Int], k: Int): Array[Int] = {
    val rotateNum = k % nums.length
    if (rotateNum==0 || nums.length==1)
      nums
    else
      nums.drop(nums.length-rotateNum)++nums.take(nums.length-rotateNum)
  }

  def rotate(nums: Array[Int], k: Int): Array[Int] = {
    val rotateNum = k % nums.length
    if (rotateNum == 0 || nums.length == 1)
      nums
    else {
      reverse(nums,0,nums.length-1)
      reverse(nums,0,rotateNum-1)
      reverse(nums,rotateNum,nums.length-1)
      nums
    }
  }

  def reverse(nums: Array[Int], start: Int,end:Int): Array[Int] = {
    var i = start
    var j = end
    while (i<j){
      val temp =nums(i)
      nums(i) = nums(j)
      nums(j) = temp
      i += 1
      j -= 1
    }
    nums
  }
}
