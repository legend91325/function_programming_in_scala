package com.code.design.minStack


/**
 * @Auther: WuKong
 * @Date: 2023/3/6 17:46
 * @Description:
 */
class MinStack() {
  class ListNode(_x: Int = 0,_min:Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var min: Int = _min
    var x: Int = _x
  }

  val head = new ListNode(0, 0 ,null)

  def push(`val`: Int) {
    if(head.next ==null){
      head.next = new ListNode(`val`, `val`,null)
    }else{
      head.next = new ListNode(`val`, Math.min(head.next.min,`val`),head.next)
    }
  }

  def pop() {
    head.next = head.next.next
  }

  def top(): Int = {
    head.next.x

  }

  def getMin(): Int = {
    head.next.min
  }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
