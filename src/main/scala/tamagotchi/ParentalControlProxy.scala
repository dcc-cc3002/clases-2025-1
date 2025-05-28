package tamagotchi

import tamagotchi.state.{Happy, State}

import java.time.LocalTime


class ParentalControlProxy extends AbstractTamagotchi {
  private val tamagotchi = new TamagotchiImpl
  private var timedFed = 0

  def feed(): Unit = {
    if (timedFed > 3) {
      println("...")
    } else {
      timedFed += 1
      tamagotchi.feed()
    }
  }

  def play(): Unit = {
    if (LocalTime.now().getHour > 20) {
      println("Muy tarde")
    } else {
      tamagotchi.play()
    }
  }

  def sleep(): Unit = tamagotchi.sleep()
  
  def changeDay(): Unit = timedFed = 0
}
