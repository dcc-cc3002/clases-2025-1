package c05.constructors

import java.awt.Color

class ColorPoint(var x: Double, var y: Double) {
  var color: Option[Color] = None

  def setColor(c: Color): Unit = {
    color = Some(c)
  }
}
