package com.code.math.romanToInt

/**
 * @Auther: WuKong
 * @Date: 2023/3/16 18:11
 * @Description:
 */
object Solution {
  def romanToInt(s: String): Int = {
    val romanMap = Map(
      "I" -> 1,
      "V" -> 5,
      "X" -> 10,
      "L" -> 50,
      "C" -> 100,
      "D" -> 500,
      "M" -> 1000
    )
    var sum = 0
    for(i <- 0 until s.length){
      if(i+1<s.length && romanMap(s(i).toString)<romanMap(s(i+1).toString)){
        sum -= romanMap(s(i).toString)
      }else{
        sum += romanMap(s(i).toString)
      }
    }
    sum
  }
}
