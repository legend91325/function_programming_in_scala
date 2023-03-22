package com.code.math.isPowerOfThree

/**
 * @Auther: WuKong
 * @Date: 2023/3/16 18:01
 * @Description:
 */
object Solution {
  def isPowerOfThree(n: Int): Boolean = {
    var num = n
    if(num>1) {
      while (num % 3 == 0) {
        num = num / 3
      }
    }
    (num==1)
  }
}
