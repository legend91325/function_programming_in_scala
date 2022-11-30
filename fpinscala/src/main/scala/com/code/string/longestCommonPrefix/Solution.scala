package com.code.string.longestCommonPrefix

/**
 * @Auther: WuKong
 * @Date: 2022/11/24 09:32
 * @Description:
 */

object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
    strs.drop(1).foldLeft(strs(0))((currentCommonPrefix,nextStr) => commonPrefix(currentCommonPrefix,nextStr))
  }

  def commonPrefix(xStr:String,yStr:String):String={
    val zipArray = ((xStr.toCharArray,yStr.toCharArray).zipped.map(_ == _),xStr).zipped.map((_,_))
    zipArray.takeWhile(_._1).map(_._2).mkString
  }

}