package com.code.tree.isValidBST

import com.code.tree.TreeNode

/**
 * @Auther: WuKong
 * @Date: 2023/2/6 15:55
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

  def isValidBST(root: TreeNode): Boolean = {

    def isValidBST(root: TreeNode, min: Integer, max: Integer): Boolean = root match {
      case null => true
      case _ if min!=null && root.value <= min => false
      case _ if max!=null && root.value >= max => false
      case _ => isValidBST(root.left, min, root.value) && isValidBST(root.right, root.value, max)
    }
    isValidBST(root, null, null)

  }
}