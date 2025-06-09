package cn

trait Visitor {
  def visitDirectory(i: Directory): Unit
  def visitTextFile(i: TextFile): Unit
  def visitBinaryFile(i: BinaryFile): Unit
}
abstract class AbstractVisitor extends Visitor {
  def visitDirectory(i: Directory): Unit = {
    for (item <- i.getElements()) {
      item.accept(this)
    }
  }
  def visitTextFile(i: TextFile): Unit = {}
  def visitBinaryFile(i: BinaryFile): Unit = {}
}

class NumberOfFilesVisitor extends AbstractVisitor {
  var numberOfFiles = 0
  override def visitTextFile(i: TextFile): Unit = {
    numberOfFiles += 1
  }
  override def visitBinaryFile(i: BinaryFile): Unit = {
    numberOfFiles += 1
  }
}
class NumberOfDirectoriesVisitor extends AbstractVisitor {
  var numberOfDirectories = 0

  override def visitDirectory(i: Directory): Unit = {
    numberOfDirectories += 1
    super.visitDirectory(i)
  }
}
class ListingVisitor extends AbstractVisitor {
  var listing: String = ""
  override def visitDirectory(i: Directory): Unit = {
    listing += i.getName() + "\n"
    super.visitDirectory(i)
  }

  override def visitTextFile(i: TextFile): Unit =
    listing += i.getName() + "\n"

  override def visitBinaryFile(i: BinaryFile): Unit =
    listing += i.getName() + "\n"

}

class NumberOfTextFilesVisitor extends AbstractVisitor {
  var numberOfTextFiles = 0
  override def visitTextFile(i: TextFile): Unit = numberOfTextFiles += 1
}
