package com.code.string.reverseString

/**
 * @Auther: WuKong
 * @Date: 2022/11/7 13:59
 * @Description:
 */

object Solution {
  def reverseString(s: Array[Char]): Unit = {
    for(index <-0 until s.length/2) {
      val tempValue = s(index)
      s(index) = s(s.length-1-index)
      s(s.length-1-index) = tempValue
    }
  }
}