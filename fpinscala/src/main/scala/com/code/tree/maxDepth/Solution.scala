package com.code.tree.maxDepth

import com.code.tree.TreeNode

/**
 * @Auther: WuKong
 * @Date: 2022/12/13 15:08
 * @Description:
 */

/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 * var value: Int = _value
 * var left: TreeNode = _left
 * var right: TreeNode = _right
 * }
 */
object Solution {
  def maxDepth(root: TreeNode): Int = {
    maxDepth(root,0)
  }
  def maxDepth(root:TreeNode,curMaxDepth:Int):Int ={
    root match {
      case null => curMaxDepth
      case root => math.max(maxDepth(root.left,curMaxDepth+1),maxDepth(root.right,curMaxDepth+1))
    }
  }
}