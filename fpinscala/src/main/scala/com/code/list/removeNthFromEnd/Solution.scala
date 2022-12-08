package com.code.list.removeNthFromEnd

import com.code.list.ListNode

/**
 * @Auther: WuKong
 * @Date: 2022/11/28 13:32
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
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    val emptyHead = new ListNode(0,head)
    removeNth(emptyHead,emptyHead,n+1)
    emptyHead.next
  }
  def removeNth(slowNode:ListNode,fastNode:ListNode, n:Int):Unit = {
    //delete node
    if(fastNode==null&&n<=0) {
      slowNode.next = slowNode.next.next
    }else if(n<=0) removeNth(slowNode.next,fastNode.next, n-1)
    else removeNth(slowNode,fastNode.next, n-1)
  }
}
