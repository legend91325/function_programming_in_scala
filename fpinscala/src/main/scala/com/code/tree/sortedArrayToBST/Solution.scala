package com.code.tree.sortedArrayToBST

import com.code.tree.TreeNode

/**
 * @Auther: WuKong
 * @Date: 2023/2/27 17:56
 * @Description:
 */

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    val length = nums.length
    if(length >0){
      val mid = length/2
      val root = new TreeNode(nums(mid))
      root.left = sortedArrayToBST(nums.take(mid))
      root.right = sortedArrayToBST(nums.slice(mid+1,length))
      root
    }else{
      null
    }
  }
}
