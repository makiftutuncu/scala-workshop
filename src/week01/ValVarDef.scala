package week01

object ValVarDef {
  var foo3: Int = _

  val bar2 = 'c'

  // Does not compile!
  // val bar3 = _

  /*
      Multi
      line
      comment
   */

  /**
    * ScalaDoc style comment
    */

  def main(args: Array[String]): Unit = {
    var foo: String = "akif"
    println(foo)
    foo = "mehmet"
    println(foo)

    var foo2 = "akif"
    println(foo2)

    println(foo3)
    foo3 = 5
    println(foo3)

    val bar: Boolean = true
    println(bar)

    println(bar2)

    val stringToBoolean: String => Boolean = method11(5, 6)
    val bool: Boolean = stringToBoolean("aosdhk")

    method11(3, 2)("1")

    method12("Akif", "Merhaba")
    method12("Ayşe")
    method12(message = "Sa", name = "Caner")

    method13(1, "")
    method13(1, j = "")
    method13(i = 1, "")
    method13(j = "1", i = 5)

    method14(5)
  }

  def method1 {}
  def method2: Unit = {}
  def method3 = {}

  def method4() {}
  def method5() = {}
  def method6(): Unit = {}

  def method7(i: Int) = i

  /* Does not compile
  def method8(i: Int): Int {
    i
  }
  */

  def method9(i: Int): Int =
    i * 5

  def method10(i: Int): Int = {
    i * 10
  }

  def method11(i: Int, j: Int)(k: String): Boolean = {
    k.isEmpty || i < j
  }

  def method12(name: String, message: String = "Hello"): Unit = {
    // println(message + " " + name)
    println(s"$message $name!")
  }

  def method13(i: Int, j: String = ""): Unit = {
    println(i)
    println(j)
  }

  //def method13(i: Int, j: String) {}

  def method13(i: Int): Unit = {
    println(i)
  }

  def method14(n: Int): Unit = {
    def inner(i: Int): Int = i * 5

    println(n + inner(n))
  }
}
