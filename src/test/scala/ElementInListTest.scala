package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ElementInListTest extends AnyFunSuite {
  test("elementKFromEnd method should return the kth element from end of the list if valid parameters are passed.") {
    val elementInListObject = new ElementInList[Int]
    val inputList = List(1, 2, 3, 4, 5, 6)
    val result = elementInListObject.elementKFromEnd(inputList, 2)
    assert(result.getOrElse(None) == 5)
  }
  test("elementKFromEnd method should return None if either of the parameter is not valid") {
    val elementInListObject = new ElementInList[String]
    val inputList = List("Code", "is", "being", "tested.")
    val result = elementInListObject.elementKFromEnd(inputList, 5)
    assert(result.isEmpty)
  }
  test("elementKFromEnd method should return None if empty list is passed") {
    val elementInListObject = new ElementInList[String]
    val inputList = List()
    val result = elementInListObject.elementKFromEnd(inputList, 0)
    assert(result.isEmpty)
  }
}