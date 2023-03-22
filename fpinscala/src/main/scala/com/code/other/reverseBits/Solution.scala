package com.code.other.reverseBits

/**
 * @Auther: WuKong
 * @Date: 2023/3/20 18:13
 * @Description:
 */
object Solution {
  // you need treat n as an unsigned value
  def reverseBits(x: Int): Int = {
    var num = x
    var result = 0
    for(i <- 0 until 32){
      result = result << 1
      result = result | (num & 1)
      num = num >> 1
    }
    result
  }
}
