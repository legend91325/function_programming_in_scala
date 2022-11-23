package com.code.array.plusOne

/**
 * @Auther: WuKong
 * @Date: 2022/11/2 09:13
 * @Description:
 */

object Solution {
  def main(args: Array[String]): Unit = {
    val digits = Array(9,8,9,9)
    val result = plusOne(digits)
    println(result.mkString(","))
  }
  def plusOne(digits: Array[Int]): Array[Int] = {
    for(index <- digits.length-1 to 0 by -1) {
      if(digits(index)==9)
        digits(index)=0
      else {
        digits(index) = digits(index)+1
        return digits
      }
    }
    val array = new Array[Int](digits.length+1)
    array(0)=1
    array
  }
}