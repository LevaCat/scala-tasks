object Task3_WordCounter extends App {
  val text = "Scala is great and Scala is fun. I love Scala and I love coding."
  
  val words = text.toLowerCase.split("\\W+").filter(_.nonEmpty)
  
  val wordCounts = words.groupBy(identity).map { case (word, list) => (word, list.length) }
  
  val top3 = wordCounts.toSeq.sortBy(-_._2).take(3)
  
  println("Топ-3 самых частых слов:")
  for ((word, count) <- top3) {
    println(s"'$word' встречается $count раз(а)")
  }
}
