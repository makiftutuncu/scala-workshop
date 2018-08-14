package week02

object FizzBuzz {
  def main(args: Array[String]): Unit = {
    val limit = args match {
      case Array()  => 50
      case Array(s) => s.toInt
      case _        => args.head.toInt
    }

    /*
    for (i <- build(limit)) {
      println(check(i))
    }
    */

    // for (i <- 0 until limit) println(check(i))

    // 0.until(limit).foreach(i => println(check(i)))
    // 0 until limit map check foreach println
    // 0 until limit foreach { i =>
    //   println(check(i))
    // }
    0 until limit foreach(i => println(check(i)))
  }

  // def build(limit: Int): Array[Int] = (0 until limit).toArray

  def check(n: Int): String =
    n match {
      case _ if n % 15 == 0 => "FizzBuzz"
      case _ if n % 5 == 0  => "Buzz"
      case _ if n % 3 == 0  => "Fizz"
      case _                => n.toString
    }
}
