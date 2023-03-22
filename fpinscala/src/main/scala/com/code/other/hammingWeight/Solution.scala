package com.code.other.hammingWeight

/**
 * @Auther: WuKong
 * @Date: 2023/3/16 18:19
 * @Description:
 */
object Solution {
  // you need treat n as an unsigned value
  def hammingWeight(n: Int): Int = {
    var count = 0
    for(i <- 0 until 32){
      if(((n>>>i) & 1) == 1){
        count += 1
      }
    }
    count
  }
}
