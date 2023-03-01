package com.code.sortAndSearch.merge

/**
 * @Auther: WuKong
 * @Date: 2023/2/27 19:06
 * @Description:
 */

object Solution {
  /**
   * 结果为非递减排序，从后往前排序，先放大的
   * @param nums1
   * @param m
   * @param nums2
   * @param n
   */
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var nums1TailIndex = m-1
    var nums2TailIndex = n-1
    var tailIndex = m+n-1
    while (nums1TailIndex>=0 && nums2TailIndex>=0){
      if(nums1(nums1TailIndex) >= nums2(nums2TailIndex)){
        nums1(tailIndex) = nums1(nums1TailIndex)
        nums1TailIndex -= 1
      }else{
        nums1(tailIndex) = nums2(nums2TailIndex)
        nums2TailIndex -= 1
      }
      tailIndex -=1
    }
    // num1TailIndex 大于等于0情况，就直接不用操作了，因为都在nums1数组上
    while (nums2TailIndex>=0){
      nums1(tailIndex) = nums2(nums2TailIndex)
      nums2TailIndex -= 1
      tailIndex -=1
    }
  }
}
