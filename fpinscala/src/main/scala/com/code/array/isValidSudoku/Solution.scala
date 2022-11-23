package com.code.array.isValidSudoku

/**
 * @Auther: WuKong
 * @Date: 2022/11/2 17:42
 * @Description:
 */
object Solution {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    //行
    val verticalArray = new Array[Int](9)
    //列
    val horizontalArray = new Array[Int](9)
    //9宫格里有9个3*3宫格
    val threeGridArray = Array.ofDim[Int](3,3)
    for(verticalIndex <- 0 until board.length) {
      for(horizontalIndex <- 0 until board.length) {
        if(board(verticalIndex)(horizontalIndex)!='.') {
          //值为多少，就左移多少位 减小存储空间，一个int可以通过9个位来标识对应数字是否存在，存在为1，不存在为0
          val bitValue = 1 << board(verticalIndex)(horizontalIndex).toInt
          if((verticalArray(verticalIndex)&bitValue)>0 || (horizontalArray(horizontalIndex)&bitValue)>0)
            return false
          else if((threeGridArray(verticalIndex/3)(horizontalIndex/3)&bitValue)>0)
            return false
          else {
            verticalArray(verticalIndex) |= bitValue
            horizontalArray(horizontalIndex) |= bitValue
            threeGridArray(verticalIndex/3)(horizontalIndex/3) |= bitValue
          }
        }
      }
    }
    true
  }
}
