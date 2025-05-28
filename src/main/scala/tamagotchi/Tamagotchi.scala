package tamagotchi

import tamagotchi.state.State

trait Tamagotchi {
  
  def setState(state: State): Unit
  
  def feed(): Unit
  
  def play(): Unit
  
  def sleep(): Unit
}
