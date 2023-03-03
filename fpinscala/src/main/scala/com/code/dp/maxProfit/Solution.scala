package com.code.dp.maxProfit

/**
 * @Auther: WuKong
 * @Date: 2023/3/1 18:34
 * @Description:
 */
object Solution {
  /**
   * 买卖股票的最佳时机 dp算法
   * @param prices
   * @return
   */
  def maxProfit(prices: Array[Int]): Int = {
    val dp: Array[Array[Int]] = Array.ofDim[Int](prices.length, 2)
    //未持有股票最大收益
    dp(0)(0) = 0
    //持有股票最大收益
    dp(0)(1) = -prices(0)
    for (i <- 1 until prices.length) {
      //未持有股票
      dp(i)(0) = Math.max(dp(i - 1)(0), dp(i - 1)(1) + prices(i))
      //持有股票
      dp(i)(1) = Math.max(dp(i - 1)(1), -prices(i))
    }
    dp(prices.length - 1)(0)
  }


  /**
   * 指针版本
   * @param prices
   * @return
   */
  def maxProfit2(prices:Array[Int]):Int = {
    if(prices==null || prices.length==0){
      return 0
    }
    var minPrice = prices(0)
    var maxProfit = 0
    for(i <- 1 until prices.length){
      if(prices(i)<minPrice){
        minPrice = prices(i)
      }else if(prices(i)-minPrice>maxProfit){
        maxProfit = prices(i)-minPrice
      }
    }
    maxProfit
  }

}

