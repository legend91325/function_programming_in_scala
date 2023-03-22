package com.code.math.fizzBuzz

/**
 * @Auther: WuKong
 * @Date: 2023/3/13 17:44
 * @Description:
 */
object Solution {
  def fizzBuzz(n: Int): List[String] = {
    val answer = Array.range(1,n+1).map(_.toString)
    for(i <- 0 until answer.length){
      if(answer(i).toInt%3==0 && answer(i).toInt%5==0){
        answer(i) = "FizzBuzz"
      }else if(answer(i).toInt%3==0){
        answer(i) = "Fizz"
      }else if(answer(i).toInt%5==0){
        answer(i) = "Buzz"
      }else{
        answer(i) = answer(i)
      }
    }
    answer.toList
  }
}
