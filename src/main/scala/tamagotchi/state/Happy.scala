package tamagotchi.state

import tamagotchi.Tamagotchi

class Happy extends State {
  override def play(context: Tamagotchi): Unit =
    context.setState(new Hungry)

  override def isHappy: Boolean = true
}
