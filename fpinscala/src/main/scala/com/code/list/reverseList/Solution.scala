package com.code.list.reverseList

import com.code.list.ListNode

/**
 * @Auther: WuKong
 * @Date: 2022/12/1 15:39
 * @Description:
 */

/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 * var next: ListNode = _next
 * var x: Int = _x
 * }
 */
object Solution {
  def reverseList(head: ListNode): ListNode = {
    val emptyHead = new ListNode(-1,null)
    headInsert(head,emptyHead)
    emptyHead.next
  }

  @scala.annotation.tailrec
  def headInsert(currentNode:ListNode,emptyHead:ListNode):Unit={
    if(currentNode!=null){
      val nextNode = currentNode.next
      currentNode.next = emptyHead.next
      emptyHead.next = currentNode
      headInsert(nextNode,emptyHead)
    }
  }
}