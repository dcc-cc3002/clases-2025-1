package c02

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val cuentaDeJohn: IAccount = new Account(0, "USD")
    val cuentaDeAlice: IAccount = new Account(1000, "CLP")

    cuentaDeJohn.deposit(cuentaDeAlice.withdraw(2000))
    print(cuentaDeJohn.getBalance())
  }
}
