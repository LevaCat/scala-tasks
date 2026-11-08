import scala.io.StdIn._

object Task1_DigitsProfit extends App {
  val line1 = readLine().split(" ")
  val k = line1(1).toInt
  val numbers = readLine().split(" ").map(_.toLong)

  val profit = for {
    num <- numbers
    numStr = num.toString
    i <- (numStr.length - 1) to 0 by -1
    digit = numStr(i).asDigit
    if digit < 9
  } yield {
    val power = math.pow(10, numStr.length - 1 - i).toLong
    (9L - digit) * power
  }

  val sortedProfit = profit.sorted.reverse
  val operations = math.min(k, sortedProfit.length)
  
  var totalProfit = 0L
  for (i <- 0 until operations) {
    totalProfit += sortedProfit(i)
  }

  println("Максимальная выгода: " + totalProfit)
}
