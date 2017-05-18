// A comment!
/* Another comment */
/** A documentation comment */

object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  def fib(n: Int): Int = {
    def go(n: Int, acc: Int, prev: Int): Int =
      if (n < 1) 0
      else if  (n == 1) acc
           else go(n-1, acc+prev, acc)

    go(n, 1, 0)
  }

  private def format(s: String, f: Int => Int, x: Int): String = {
    val msg = "The %s, of %d is %d"
    msg.format(s, x, f(x))
  }

  def main(args: Array[String]): Unit =
    println(format("absolute value", abs, -42))
}
