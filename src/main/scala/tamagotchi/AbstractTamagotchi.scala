package tamagotchi
import tamagotchi.state.{Happy, State}

abstract class AbstractTamagotchi extends Tamagotchi {
  protected var state: State = new Happy
  
  override def setState(state: State): Unit = 
    this.state = state  
}
