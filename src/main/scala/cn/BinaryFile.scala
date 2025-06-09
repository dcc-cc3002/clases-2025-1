package cn

class BinaryFile(name: String, content: Array[Byte])
    extends AbstractFile(name) {
  val size = content.size
  def accept(v: Visitor) = v.visitBinaryFile(this)
}
