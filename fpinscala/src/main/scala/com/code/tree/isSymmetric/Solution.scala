package com.code.tree.isSymmetric

import com.code.tree.TreeNode

/**
 * @Auther: WuKong
 * @Date: 2023/2/20 18:00
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
  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null) {
      return true
    }
    isMirror(root.left, root.right)
  }
  def isMirror(left: TreeNode, right: TreeNode):Boolean={
    if (left == null && right == null) {
      return true
    }
    if (left == null || right == null) {
      return false
    }
    if (left.value != right.value) {
      return false
    }
    isMirror(left.left, right.right) && isMirror(left.right, right.left)
  }
}
