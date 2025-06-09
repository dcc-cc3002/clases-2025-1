package cn

class TextFile(name: String, content: String) extends AbstractFile(name) {
  val size = content.length
  def accept(v: Visitor) = v.visitTextFile(this)
}
