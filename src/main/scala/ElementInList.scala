package com.knoldus

//Generic type class with method elementKFromEnd which takes generic type list
class ElementInList[T] {
  //elementKFromEnd method returns kth element form the end of the list
  def elementKFromEnd(list: List[T], kthElement: Int): Option[T] = {
    //Exception is being handled using if else statement
    val sizeOfList = list.size
    if (sizeOfList > kthElement) {
      val elementFromLeft = sizeOfList - kthElement
      Some(list(elementFromLeft))
    } else {
      None
    }
  }
}

