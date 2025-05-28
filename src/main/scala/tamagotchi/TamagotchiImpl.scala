package tamagotchi

import tamagotchi.state.{Happy, State}

class TamagotchiImpl extends AbstractTamagotchi {

  override def feed(): Unit = state.feed(this)

  override def play(): Unit = state.play(this)

  override def sleep(): Unit = state.sleep(this)
}
