package com.code.string.isAnagram

/**
 * @Auther: WuKong
 * @Date: 2022/11/8 19:14
 * @Description:
 */
object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    val alphabetArray = Array.fill(26)(0)
    if(s.length!=t.length)
      return false

    for(index <-0 until s.length){
      alphabetArray(s.charAt(index)-'a') += 1
      alphabetArray(t.charAt(index)-'a') -= 1
    }
    for(index <-0 until alphabetArray.length)
      if(alphabetArray(index)!=0)
        return false
    true
  }
}
