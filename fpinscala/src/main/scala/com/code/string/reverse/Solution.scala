package com.code.string.reverse

/**
 * @Auther: WuKong
 * @Date: 2022/11/7 18:03
 * @Description:
 */

object Solution {
  def main(args: Array[String]): Unit = {
    println(reverse(123))
  }
  def reverse(x: Int): Int = {

    @scala.annotation.tailrec
    def reverse(x:Int,reverseValue:Int): Int ={
      if (x==0)
        reverseValue
      else {
        val remainder = x%10
        val tempValue = reverseValue * 10 + remainder
        if (((tempValue - remainder) / 10) != reverseValue) {
          // 回退 不相等 说明越界了
          return 0
        }
        reverse(x/10,tempValue)
      }
    }
    reverse(x,0)
  }
}