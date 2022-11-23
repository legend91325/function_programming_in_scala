package com.code.string.countAndSay

/**
 * @Auther: WuKong
 * @Date: 2022/11/23 14:04
 * @Description:
 */
object Solution {

  def countAndSay(n: Int): String = {
    (1 to n-1).toList.foldLeft("1")((countAndSay, _) => foldCountAndSay(countAndSay,new Array[Char](0),""))
  }
  def foldCountAndSay(n:String, preVal:Array[Char], countAndSay:String):String ={
        n match {
          case "" => splicing(preVal,countAndSay)
          case _ => if(preVal.length>0&&preVal(0)==n.charAt(0))foldCountAndSay(n.substring(1),preVal:+n.charAt(0),countAndSay)
          else foldCountAndSay(n.substring(1),Array(n.charAt(0)),splicing(preVal,countAndSay))
        }
  }

  def splicing(preVal:Array[Char], countAndSay:String):String = if(preVal.length>0)countAndSay+""+preVal.length+""+preVal(0) else countAndSay

}
