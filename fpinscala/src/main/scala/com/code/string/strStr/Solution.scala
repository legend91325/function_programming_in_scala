package com.code.string.strStr

/**
 * @Auther: WuKong
 * @Date: 2022/11/10 18:55
 * @Description:
 */

object Solution {

  def strStr(haystack: String, needle: String): Int = {
    if(haystack.length>=needle.length)
      for (index <- 0 to haystack.length - needle.length)
        if (haystack.substring(index, index + needle.length) == needle) {
          return index
        }
    -1
  }
}