package c05.model

class Person(var firstName: String, var lastName: String) {
  println("Initialization begins.")

  val fullName = s"$firstName $lastName"

  def printFullName(): Unit = println(fullName)

  println("Initialization ends.")
}

@main def personExample(): Unit = {
  val p = new Person("Calvin", "Haris")
  p.printFullName()
}
