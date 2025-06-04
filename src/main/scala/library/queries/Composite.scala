package library.queries
import library.{Item, Library}

import scala.collection.mutable.ListBuffer

class And(left: Query, right: Query) extends Query {
  override def execute(library: Library): List[Item] = {
    val leftResult = left.execute(library).toSet
    val rightResult = right.execute(library).toSet
    val acc = ListBuffer.empty[Item]
    for (result <- leftResult) {
      if (rightResult.contains(result)) {
        acc.addOne(result)
      }
    }
    acc.toList
  }
}

class Or(left: Query, right: Query) extends Query {
  override def execute(library: Library): List[Item] = {
    val leftResult = left.execute(library)
    val rightResult = right.execute(library)
    leftResult.appendedAll(rightResult)
  }
}
