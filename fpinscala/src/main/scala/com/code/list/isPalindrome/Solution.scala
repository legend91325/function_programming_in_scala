package com.code.list.isPalindrome

import com.code.list.ListNode

/**
 * @Auther: WuKong
 * @Date: 2022/12/7 18:10
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

  def isPalindrome(head: ListNode): Boolean = {
    //特殊情况：一个元素
    if(head.next==null) true
    else{
      val emptyHead = new ListNode(-1, head)
      //查找中间节点的前一个节点，因为要有“剪断”操作
      val midNodePre = findMidPreNode(emptyHead.next, emptyHead.next.next)
      val reversedMidNode = reverseList(midNodePre.next)
      midNodePre.next = null
      isPalindrome(head, reversedMidNode)
    }


  }

  @scala.annotation.tailrec
  def isPalindrome(head:ListNode,reversedMidNode:ListNode):Boolean = (head,reversedMidNode) match{
    case (null,reversedMidNode) => if(reversedMidNode==null||reversedMidNode.next==null) true else false
    case (_,null) => false
    case (head,reversedMidNode) => if(head.x==reversedMidNode.x) isPalindrome(head.next,reversedMidNode.next) else false
  }

  @scala.annotation.tailrec
  def findMidPreNode(slowNode:ListNode, fastNode:ListNode):ListNode = {
    if(fastNode.next==null||fastNode.next.next==null) slowNode  else findMidPreNode(slowNode.next,fastNode.next.next)
  }


  def reverseList(head: ListNode): ListNode = {
    val emptyHead = new ListNode(-1, null)
    headInsert(head, emptyHead)
    emptyHead.next
  }

  @scala.annotation.tailrec
  def headInsert(currentNode: ListNode, emptyHead: ListNode): Unit = {
    if (currentNode != null) {
      val nextNode = currentNode.next
      currentNode.next = emptyHead.next
      emptyHead.next = currentNode
      headInsert(nextNode, emptyHead)
    }
  }
}
