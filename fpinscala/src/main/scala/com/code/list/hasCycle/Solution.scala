package com.code.list.hasCycle

import com.code.list.ListNode

/**
 * @Auther: WuKong
 * @Date: 2022/12/8 18:28
 * @Description:
 */

object Solution {
  def hasCycle(head: ListNode): Boolean = {
    if(head==null) false
    else hasCycle(head,head.next)
  }

  @scala.annotation.tailrec
  def hasCycle(slowNode:ListNode, fastNode:ListNode):Boolean = {
    (slowNode,fastNode) match {
      case (_,null) => false
      case (_,fastNode) if fastNode.next==null => false
      case (slowNode,fastNode) if (slowNode==fastNode) => true
      case (slowNode,fastNode) => hasCycle(slowNode.next, fastNode.next.next)
    }
  }
}
