package com.code.other.isValid

/**
 * @Auther: WuKong
 * @Date: 2023/3/20 19:14
 * @Description:
 */
object Solution {
  def isValid(s: String): Boolean = {
    var stack = List[Char]()
    for(i <- 0 until s.length){
      if(s(i) == '(' ){
        stack = stack :+ ')'
      }else if(s(i)=='['){
        stack = stack :+ ']'
      }else if (s(i) == '{') {
        stack = stack :+ '}'
      }else{
        if(stack.isEmpty){
          return false
        }
        if(s(i) != stack.last ){
          return false
        }

        stack = stack.dropRight(1)
      }
    }
    stack.isEmpty

  }
}
