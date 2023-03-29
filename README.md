# Day1Assignment3-session4
## Problem Statement
Define a function that would take a generic list and a number (k) and would return the kth element from the end.  
Sample Input: elementKFromEnd(List(1, 2, 3, 4, 5, 6), 2)  
Sample Output: 5  
## Source Code
class ElementInList[T] {  
  def elementKFromEnd(list : List[T] , kthElement : Int) : Option[T] = {  
      val sizeOfList= list.size  
      if(sizeOfList > kthElement) {  
        val elementFromLeft = sizeOfList - kthElement  
        Some(list(elementFromLeft))  
      } else {  
        None  
      }  
  }  
}  
