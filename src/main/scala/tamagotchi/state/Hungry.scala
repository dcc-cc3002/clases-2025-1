package tamagotchi.state
import tamagotchi.Tamagotchi

class Hungry extends State {
  override def feed(context: Tamagotchi): Unit =
    changeState(context, new Sleepy)
    
  override def isHungry: Boolean = true
}
