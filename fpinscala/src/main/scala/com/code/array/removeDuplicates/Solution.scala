package com.code.array.removeDuplicates

object Solution {
  def main(args: Array[String]): Unit = {
    var nums:Array[Int] = Array(1,1,2,3,3,4,4,4,5)
    val k = removeDuplicates_v1(nums)
    println(k)
    print(nums.mkString(","))
  }
  def removeDuplicates(nums: Array[Int]): Int = {
      def cut(firstCursor:Int,secondCursor:Int):Int ={
        if (secondCursor > nums.length-1) firstCursor+1
        else if(nums(firstCursor)==nums(secondCursor)) cut(firstCursor, secondCursor+1)
        else {
          nums(firstCursor+1) = nums(secondCursor)
          cut(firstCursor+1,secondCursor+1)
        }
      }

    if (nums==null||nums.isEmpty) 0
    else cut(0,1)
  }


  def removeDuplicates_v1(nums: Array[Int]): Int = {
    if(nums==null||nums.isEmpty) 0
    else nums.drop(1).foldLeft((1,nums(0)))((tupleArg,currentValue) =>{
      val (duplicateItemCount:Int,previousValue:Int) = tupleArg
      // 重复值，去重后 数量，值没变
      if(currentValue==previousValue)(duplicateItemCount,previousValue)
      else {
        nums(duplicateItemCount) = currentValue
        (duplicateItemCount+1,currentValue)
      }
    })._1
  }
}
