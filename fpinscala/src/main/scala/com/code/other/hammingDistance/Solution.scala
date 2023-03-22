package com.code.other.hammingDistance

/**
 * @Auther: WuKong
 * @Date: 2023/3/20 17:52
 * @Description:
 */
object Solution {
  def hammingDistance(x: Int, y: Int): Int = {
    var num = x^y
    var count = 0
    for(i <- 0 until 32){
      if(((num>>>i) & 1) == 1){
        count += 1
      }
    }
    count

  }
}
