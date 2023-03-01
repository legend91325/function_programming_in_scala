package com.code.tree.levelOrder

import com.code.tree.TreeNode

import scala.collection.mutable.ListBuffer

/**
 * @Auther: WuKong
 * @Date: 2023/2/22 09:07
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
  def levelOrder(root: TreeNode): List[List[Int]] = {
    if(root == null){
      return List()
    }
    val levelOrderList = new ListBuffer[ListBuffer[Int]]()
    levelOrderList += (new ListBuffer[Int]()+=root.value)
    levelOrder(root.left,root.right,2,levelOrderList)
    levelOrderList.toList.map(_.toList)

  }
  def levelOrder(left:TreeNode,right:TreeNode,depth:Int, levelOrderList:ListBuffer[ListBuffer[Int]]):Unit={
    if(left == null && right == null){
      return
    }
    if(levelOrderList.length < depth) {
      levelOrderList += new ListBuffer[Int]()
    }
    if(left != null) {
      levelOrderList(depth-1) = levelOrderList(depth-1) :+ left.value.intValue()
    }
    if(right != null){
      levelOrderList(depth-1) = levelOrderList(depth-1) :+ right.value.intValue()
    }
    if(left != null){
      levelOrder(left.left,left.right,depth+1,levelOrderList)
    }
    if(right != null){
      levelOrder(right.left,right.right,depth+1,levelOrderList)
    }
  }
}

