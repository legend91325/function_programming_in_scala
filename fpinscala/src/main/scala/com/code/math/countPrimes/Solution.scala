package com.code.math.countPrimes

/**
 * @Auther: WuKong
 * @Date: 2023/3/13 17:54
 * @Description:
 */
object Solution {
  /**
   * ref: https://oi-wiki.org/math/number-theory/sieve/
   * @param n
   * @return
   */
  def countPrimes(n: Int): Int = {
    if(n<=2) return 0
    // 用于标记是否为质数 true为质数
    val isPrime = Array.fill(n)(true)
    // 质数的个数
    var count = 0
    isPrime(0) = false
    isPrime(1) = false

    for (i <- 2 until n) {
      if (isPrime(i)) {
        count += 1
        if(i < n){
          var j = i
          while (j < n) {
            isPrime(j) = false
            j += i
          }
        }
      }
    }
    count
  }
}
