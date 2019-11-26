package io.turntabl.scalagettingstarted.functionalscala

object MyApp extends App {
  //Writing  a function that takes a String and returns its length.
  val getStringLength = (s: String) => s.length
  println(getStringLength("Turntabl Ghana Ltd"))

  //Writing another function that takes a String and returns number of spaces in the String.
  val getNumberofSpacesInString = (s: String) => s.length - s.replaceAll(" ", "").length
  println(getNumberofSpacesInString("Turntabl is made up of professional developers"))
  // OR
  val getNumberofSpacesInString2 = (s: String) => s.replace("[^ ]", "" ).length
  println(getNumberofSpacesInString2("Turntabl is made up of professional developers"))

  val ApplyToString = (s: String, f: (String => Int)) => f(s)
  println(ApplyToString("Yaa is a good girl", getStringLength))
  println(ApplyToString("Yaa is a good girl", getNumberofSpacesInString))

  val calculate =(s: String) => ((i: Int, n: Int)=> s match{
  case "add" => i + n
  case "subtract" => i - n
}
  )
val diff = calculate ("subtract")
 println(diff(19, 8))

 val sum = calculate("add")
  println(sum(11, 6))
}


