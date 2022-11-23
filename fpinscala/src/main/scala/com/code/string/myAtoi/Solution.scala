package com.code.string.myAtoi

import scala.util.{Failure, Success, Try}
/**
 * @Auther: WuKong
 * @Date: 2022/11/10 08:50
 * @Description:
 */

object Solution {
  def myAtoi(s: String): Int = {
    import scala.util.{Failure, Success, Try}
    val numberPattern = "^\\s*?([\\+\\-]?)(\\d+).*$".r
    s match {
      case numberPattern(signal,numberString) =>{
        Try((signal+numberString).toInt) match {
          case Success(value) => value
          case _ => {
            if ((signal+numberString).startsWith("-")) Int.MinValue
            else Int.MaxValue
          }
        }
      }
      case _ => 0
    }
  }

  def myAtoi_v1(s: String): Int =
    "^[\\+\\-]?\\d+".r.findFirstIn(s.trim) match {
      case Some(value) =>
        Try(value.toInt) match {
          case Success(value) => value
          case _ => {
            if (value.startsWith("-")) Int.MinValue
            else Int.MaxValue
          }
        }
      case None => 0
    }

}
