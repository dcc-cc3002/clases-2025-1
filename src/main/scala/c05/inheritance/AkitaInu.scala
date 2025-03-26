package c05.inheritance

import java.awt.Color

class AkitaInu(name: String) extends Legged with Tailed {
  override val numLegs: Int = 4

  override def walk(): Unit =
    println(s"$name is walking on its $numLegs legs.")

  override val tailColor: Color = Color.WHITE
}
