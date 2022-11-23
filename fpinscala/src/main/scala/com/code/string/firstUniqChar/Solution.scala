package com.code.string.firstUniqChar

/**
 * @Auther: WuKong
 * @Date: 2022/11/7 18:51
 * @Description:
 */
object Solution {
  def firstUniqChar(s: String): Int = {
    val alphabetArray = Array.fill(26)(0)
    s.foreach(alphabet => alphabetArray(alphabet - 'a') += 1)
    s.indexWhere(alphabet => alphabetArray(alphabet - 'a') == 1)
  }
}
