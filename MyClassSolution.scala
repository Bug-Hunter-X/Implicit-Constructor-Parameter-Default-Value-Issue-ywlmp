```scala
class MyClass(val x: Int) {
  def this() = {
    this(0) // Explicitly call the primary constructor with the default value
  }
}
```