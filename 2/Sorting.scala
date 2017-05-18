object Sorting {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop(i: Int, acc: Boolean): Boolean = {
      if (!acc) false
      else if (i >= as.length-1) acc
      else loop(i+1, acc && ordered(as(i), as(i+1)))
    }

    loop(0, true)
  }
}
