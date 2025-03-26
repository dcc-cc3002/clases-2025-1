package c05.model

import java.time.LocalDate

class Student(val name: String, val id: String, val enrollmentDate: LocalDate) {

  println(s"[LOG] Registered student '$name' with ID '$id' on $enrollmentDate")

  // Auxiliary constructor: fills in the current date
  def this(name: String, id: String) = {
    this(name, id, LocalDate.now())
    println(s"[INFO] Enrollment date defaulted to today.")
  }

  // Auxiliary constructor: generates a basic ID based on name
  def this(name: String) = {
    this(name, name.take(3).toUpperCase + "-000")
    println(s"[INFO] Generated ID from name.")
  }

  override def toString: String = s"Student($name, $id, $enrollmentDate)"
}

import java.time.LocalDate

@main def duelAcademy(): Unit = {
  // Full constructor with custom ID and date
  val johan =
    new Student("Johan Andersen", "CRY-777", LocalDate.parse("2005-04-01"))
  // Constructor with ID, uses current date
  val judai = new Student("Yuki Judai", "HRO-001")
  // Generates ID from name, uses current date
  val asuka = new Student("Tenjoin Asuka")

  val sho = new Student("Marufuji Sho")
  val ryo = new Student("Marufuji Ryo", "KSR-002")

  println(johan)
  println(judai)
  println(asuka)
  println(sho)
  println(ryo)
}
