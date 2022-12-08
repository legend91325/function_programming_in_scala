package com.code.list.mergeTwoLists

import com.code.list.ListNode


/**
 * @Auther: WuKong
 * @Date: 2022/12/6 18:20
 * @Description:
 */

object Solution {
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {

    val emptyHead = new ListNode(-1,null)
    mergeTwo(list1, list2, emptyHead)
    emptyHead.next

  }
  def mergeTwo(list1:ListNode,list2:ListNode,emptyHead:ListNode):Unit={
    if(list1 == null)
      emptyHead.next = list2
    else if(list2 == null)
      emptyHead.next = list1
    else if(list1.x<=list2.x){
      emptyHead.next = new ListNode(list1.x,null)
      mergeTwo(list1.next,list2,emptyHead.next)
    }else{
      emptyHead.next = new ListNode(list2.x,null)
      mergeTwo(list1, list2.next, emptyHead.next)
    }
  }
}
