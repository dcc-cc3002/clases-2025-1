package c13

object Bar {
  def main(args: Array[String]): Unit = {
    val b = true
    val x =
      try {
        if (b)
          throw new E
        else
          10
      } catch {
        case e: E => 20
      } finally {
        20
        30
      }

    println(x)
  };
}
