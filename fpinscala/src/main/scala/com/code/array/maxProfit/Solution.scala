package com.code.array.maxProfit

/**
 * @Auther: WuKong
 * @Date: 2022/10/26 11:40
 * @Description:
 */
object Solution {
  def main(args: Array[String]): Unit = {
    var prices = Array(7,1,5,3,6,4)
    val profit = maxProfit(prices)
    println(profit)
  }
  def maxProfit(prices: Array[Int]): Int = {
    if(prices==null||prices.isEmpty) 0

    prices.drop(1).foldLeft((0,prices(0)))((tupleArg,currentValue) => {
      val(profit:Int,preValue:Int) = tupleArg
      if(currentValue > preValue) (profit+currentValue-preValue,currentValue)
      else (profit,currentValue)
    })._1
  }

}
