package com.code.array.intersect

/**
 * @Auther: WuKong
 * @Date: 2022/11/1 18:17
 * @Description:
 */

object Solution {
  def main(args: Array[String]): Unit = {
    val nums1 = Array(1,2,3,4,7,4,3)
    val nums2 = Array(4,7,3)
    val intersectArray = intersect(nums1,nums2)
    println(intersectArray.mkString(","))
  }
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {

    @scala.annotation.tailrec
    def intersectSorted( nums1Sorted:(Int, Array[Int]), nums2Sorted:(Int, Array[Int]),intersectArray:List[Int]): List[Int] ={
      if(nums1Sorted._1>=nums1Sorted._2.length||nums2Sorted._1>=nums2Sorted._2.length)
        intersectArray
      else if(nums1Sorted._2(nums1Sorted._1)==nums2Sorted._2(nums2Sorted._1)) {
        intersectSorted((nums1Sorted._1+1,nums1Sorted._2),(nums2Sorted._1+1,nums2Sorted._2),intersectArray:+nums1Sorted._2(nums1Sorted._1))
      }else if (nums1Sorted._2(nums1Sorted._1)>nums2Sorted._2(nums2Sorted._1)){
        intersectSorted((nums1Sorted._1,nums1Sorted._2),(nums2Sorted._1+1,nums2Sorted._2),intersectArray)
      }else{
        intersectSorted((nums1Sorted._1+1,nums1Sorted._2),(nums2Sorted._1,nums2Sorted._2),intersectArray)
      }
    }
    val nums1Sorted = nums1.sorted
    val nums2Sorted = nums2.sorted
    val intersectList = intersectSorted((0,nums1Sorted),(0,nums2Sorted),List[Int]())
    intersectList.toArray
  }
}