object Task4_ValidEmail extends App {
  val emails = List("test@mail.ru", "invalid-email", "user@domain", "admin@test.com", "broken@.com")
  
  def isValidEmail(email: String): Boolean = {
    email.contains("@") && email.contains(".") && email.indexOf("@") < email.lastIndexOf(".")
  }
  
  val validEmails = emails.filter(isValidEmail)
  
  println("Валидные email-адреса:")
  validEmails.foreach(println)
}
