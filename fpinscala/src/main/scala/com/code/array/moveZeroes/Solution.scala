package com.code.array.moveZeroes

/**
 * @Auther: WuKong
 * @Date: 2022/11/2 13:40
 * @Description:
 */

object Solution {
  def main(args: Array[String]): Unit = {
    val nums = Array(1,0,0,3,0,5,0,0,6)
    moveZeroes(nums)
    println(nums.mkString(","))
  }
  def moveZeroes(nums: Array[Int]): Unit = {

    @scala.annotation.tailrec
    def moveZeroes(currentOffset:Int,currentNoZeroOffset:Int)(implicit nums:Array[Int]): Unit ={
      if(currentOffset>=nums.length) {
        for(index<-currentNoZeroOffset+1 until nums.length)
          nums(index)=0
        return
      }

      if(nums(currentOffset)!=0) {
        nums(currentNoZeroOffset+1) = nums(currentOffset)
        moveZeroes(currentOffset+1,currentNoZeroOffset+1)
      }else
        moveZeroes(currentOffset+1,currentNoZeroOffset)
    }
    moveZeroes(0,-1)(nums)

  }
}