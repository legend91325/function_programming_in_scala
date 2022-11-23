package com.code.string.isPalindrome

/**
 * @Auther: WuKong
 * @Date: 2022/11/9 17:40
 * @Description:
 */
object Solution {
  def isPalindrome(s: String): Boolean = {

    def _isPalindrome(s:String): Boolean =  {
      if(s.isEmpty) true
      else if(s.head != s.last) false
      else _isPalindrome(s.drop(1).dropRight(1))
    }
    _isPalindrome(s.filter(x=> x.isLetterOrDigit).map(x=>x.toLower))
  }


  def isPalindrome_v1(s: String): Boolean = {
    val sFilter = s.filter(x => x.isLetterOrDigit).map(x => x.toLower)
    if(sFilter.isEmpty) true
    else
    (for (x <- 0 to sFilter.length/2) yield (sFilter(x) == sFilter(sFilter.length - x - 1))).reduceLeft((acc,n)=> acc && n)
  }
}
