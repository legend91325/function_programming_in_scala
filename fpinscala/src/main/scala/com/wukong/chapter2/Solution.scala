package com.wukong.chapter2

object Solution {
  //2.1
  def fib(n:Int):Int={
      @annotation.tailrec
      def loop(n: Int, prev: Int, cur: Int): Int = {
         if (n == 0) prev
         else if (n==1) cur
         else loop(n - 1, cur, prev + cur)
      }

      loop(n, 0, 1)
   }
  // 2.2
  def isSorted[A](as:Array[A],ordered:(A,A)=>Boolean):Boolean={
    for(index<-0 until as.length-1)
      if(!ordered(as(index),as(index+1)))
        return false

    true
  }
  //2.3 没搞懂 啥意思
  def curry[A,B,C](f:(A,B) => C):A=>(B=>C)=a=>b=>f(a,b)
  //2.4
  def uncurry[A,B,C](f:A=>B=>C):(A,B)=>C=(a,b)=>f(a)(b)
  //2.5
  def compose[A,B,C](f:B=>C,g:A=>B):A=>C=a=>f(g(a))

}
