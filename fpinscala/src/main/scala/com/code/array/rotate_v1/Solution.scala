package com.code.array.rotate_v1

/**
 * @Auther: WuKong
 * @Date: 2022/11/4 13:57
 * @Description:
 */

object Solution {
  def rotate(matrix: Array[Array[Int]]): Unit = {
    /*
    * 题解：
    * 1. 置换逻辑：旋转90度 等同于规律 (i,j) 位置置为 (length-1-j)(i)
    * 2. 每次置换数量： 正方形，每次钉住左上角，依次置换对应的四个角
    *    - (i,j) -> (length-1-j,i)
    *    - (length-1-j,i) -> (length-1-i,length-1-j)
    *    - (length-1-i,length-1-j) -> (length-1-(length-1-j),length-1-i) 等同于 (j,length-1-i)
    *    - (j,length-1-i) -> (length-1-(length-1-i),j) 等同于（i,j)
    * 2. 如果遍历完成置换：思路是正方形，对称 遍历四分之一，就可以（每次循环更新四个角），两个对角线，分四块，遍历最上边的一块
    * */
    for(i <- 0 until matrix.length/2)
      for(j <- i until matrix.length-i-1) {
        val tempValue = matrix(i)(j)
        matrix(i)(j) = matrix(matrix.length-1-j)(i)
        matrix(matrix.length-1-j)(i) = matrix(matrix.length-1-i)(matrix.length-1-j)
        //等同于 matrix(matrix.length-1-i)(matrix.length-1-j) = matrix(matrix.length-1-(matrix.length-1-j))(matrix.length-1-i)
        matrix(matrix.length-1-i)(matrix.length-1-j) = matrix(j)(matrix.length-1-i)
        //等同于 matrix(matrix.length-1-(matrix.length-1-j))(matrix.length-1-i) = tempValue
        matrix(j)(matrix.length-1-i) = tempValue
      }
  }
}