## Hello World!

Welcome to Scala Workshop!

#### What is Scala?

* Since 2003, from EPFL, by Martin Odersky (reyiz)
* Runs on JVM
* FP and OOP
* Better Java?

#### Installing on Mac via Homebrew

```bash
brew install scala
```

#### Hello World in Scala

```scala
println("Hello world!")
```

#### Running Hello World from a File

HelloWorld.scala

```scala
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}
```

```bash
scala HelloWorld.scala
```

#### Running Hello World from REPL

```bash
scala
Welcome to Scala 2.12.6 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_172).
Type in expressions for evaluation. Or try :help.

scala> println("Hello world!")
Hello world!
```
