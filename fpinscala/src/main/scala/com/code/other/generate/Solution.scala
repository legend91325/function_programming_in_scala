package com.code.other.generate

/**
 * @Auther: WuKong
 * @Date: 2023/3/20 19:09
 * @Description:
 */
object Solution {
  def generate(numRows: Int): List[List[Int]] = {
    var result = List[List[Int]]()
    for(i <- 0 until numRows){
      var list = List[Int]()
      for(j <- 0 to i){
        if(j==0 || j==i){
          list = list :+ 1
        }else{
          list = list :+ (result(i-1)(j-1) + result(i-1)(j))
        }
      }
      result = result :+ list
    }
    result
  }
}
