package cn

class FileSystem {
  val root = new Directory("root")
  def add(i: Item): Unit = root.add(i)
  def getSize(): Int = root.getSize()
  def numberOfFiles(): Int = {
    val v = new NumberOfFilesVisitor()
    root.accept(v)
    v.numberOfFiles
  }
  def numberOfDirectories(): Int = {
    val v = new NumberOfDirectoriesVisitor()
    root.accept(v)
    v.numberOfDirectories
  }
  def listing(): String = {
    val v = new ListingVisitor()
    root.accept(v)
    v.listing
  }
  def numberOfTextFiles(): Int = {
    val v = new NumberOfTextFilesVisitor()
    root.accept(v)
    v.numberOfTextFiles
  }

}
