package tamagotchi.state

import tamagotchi.Tamagotchi

class State {

  def changeState(context: Tamagotchi, state: State): Unit =
    context.setState(state)

  def feed(context: Tamagotchi): Unit =
    throw new InvalidTransitionException

  def sleep(context: Tamagotchi): Unit =
    throw new InvalidTransitionException

  def play(context: Tamagotchi): Unit =
    throw new InvalidTransitionException

  // Solo para tests
  def isHungry: Boolean = false
  def isHappy: Boolean = false
  def isSleepy: Boolean = false
}

class InvalidTransitionException extends Exception
