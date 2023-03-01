package com.code.dp.climbStairs

/**
 * @Auther: WuKong
 * @Date: 2023/3/1 14:37
 * @Description:
 */
object Solution {


  /**
   * 非递归
   * @param n
   * @return
   */
  def climbStairs(n:Int):Int = {
    val dp = new Array[Int](n+1)
    dp(0) = 1
    dp(1) = 1
    for(i <- 2 to n){
      dp(i) = dp(i-1)+dp(i-2)
    }
    dp(n)
  }

  /**
   * 递归
   * @param n
   * @return
   */
    def climbStairs2(n: Int): Int = {
      if(n>2){
        climbStairs(n-1)+climbStairs(n-2)
      }else{
        n
      }
    }

}
