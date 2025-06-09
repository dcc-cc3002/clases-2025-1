package tamagotchi.state
import tamagotchi.Tamagotchi

class Sleepy extends State {
  override def sleep(context: Tamagotchi): Unit = 
    changeState(context, new Happy)
    
  override def isSleepy: Boolean = true
}
