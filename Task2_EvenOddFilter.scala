import scala.io.StdIn._

object Task2_EvenOddFilter extends App {
  val n = readInt()
  val heights = readLine().split(" ").map(_.toInt)

  var evenOnOdd = -1
  var oddOnEven = -1
  var cntEvenOnOdd = 0
  var cntOddOnEven = 0

  for (i <- 0 until n) {
    val pos = i + 1
    val h = heights(i)

    if (pos % 2 != 0 && h % 2 == 0) {
      cntEvenOnOdd += 1
      evenOnOdd = pos
    } else if (pos % 2 == 0 && h % 2 != 0) {
      cntOddOnEven += 1
      oddOnEven = pos
    }
  }

  if (cntEvenOnOdd == 1 && cntOddOnEven == 1) {
    println("Поменять местами учеников: " + evenOnOdd + " и " + oddOnEven) 
  } else if (cntEvenOnOdd == 0 && cntOddOnEven == 0) {
    if (n >= 3) println("Все на местах, можно поменять 1 и 3") else println("Невозможно исправить")
  } else {
    println("Одной заменой не обойтись")
  }
}
