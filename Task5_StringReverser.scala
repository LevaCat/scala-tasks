object Task5_StringReverser extends App {
  val sentence = "hello world from scala"
  
  val words = sentence.split(" ")
  val reversedWords = words.reverse.mkString(" ")
  
  val capitalized = reversedWords.capitalize
  
  println("Исходное: " + sentence)
  println("Результат: " + capitalized)
}
