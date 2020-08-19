
object Functions extends App {

  def aFunction(a: String, b: String): String = {
    a + ", " + b
  }

  println(aFunction("Hello", "world!"))

  def noParams() = {
    "This is weird, huh?"
  }

  println(noParams)

  // This is better than loops...because it is the "scala" way
  // loops evaluate a condition every iteration,
  // But if everything is immutable, condition should not evaluate to different values between two iterations,
  // hence this inherently requires some form of mutability which is considered a sin in functional programming ;)
  def recursiveFunction(str: String, limit: Int): String = {
    if(limit == 1) str
    else {
      str + recursiveFunction(str, limit - 1)
    }
  }

  println(recursiveFunction("repeat", 2))

}
