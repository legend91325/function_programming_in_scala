package com.wukong.chapter2

/**
 * @Auther: WuKong
 * @Date: 2022/11/21 12:40
 * @Description:
 */
object fib {
   def fib(n:Int):Int={
      @annotation.tailrec
      def loop(n: Int, prev: Int, cur: Int): Int = {
         if (n == 0) prev
         else if (n==1) cur
         else loop(n - 1, cur, prev + cur)
      }

      loop(n, 0, 1)
   }

   def main(args: Array[String]): Unit = {
      print(fib(20))
   }

}
