package example


object ValidEmail extends App {
  def apply(): ValidEmail = new ValidEmail()

  val valEmail = ValidEmail()

  println(valEmail.validEmail(args(0)))
}

class ValidEmail {
  val emailPattern = """([\w\.!#$%&*+/=?^_`{|}~-]+)@([\w]+)([\.]{1}[\w]+)+"""

  def validEmail(email: String): Boolean = email match {
    case null => false
    case e if e.trim.isEmpty => false
    case e if emailPattern.r.findFirstMatchIn(e).isDefined => true
    case _ => false
  }
}
