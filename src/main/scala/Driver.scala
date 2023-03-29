package com.knoldus
/*The following project consists of a method which takes input parameters of list and kth element.
* The method will return the kth element from end of the list.
*                                                                      -Ayush Pathak*/
object Driver {
  def main(args: Array[String]): Unit = {
    val elementInListObject= new ElementInList[Int]
    val list=List(1,2,3,4,5,6)
    val result=elementInListObject.elementKFromEnd(list,2)
    println(result.getOrElse(None))
  }
}