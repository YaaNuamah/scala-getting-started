package io.turntabl.scalagettingstarted

//Creating two variables of type String and using interpolation to print out a sentence saying something.
object MyApp extends App {
    val first: String = "Yaa"
                  val town: String = "Dansoman"
                    print("Yaa\nwas\nborn\nin\nDansoman\n")

  //Writing a method called threeTimes that takes a string and returns the string three times.
    def threetimes(i: String) = i * 3
    print(threetimes("hello"))
    print("\n")

  //Writing a method called EVEN that takes an Int and returns true if the number is EVEN.
    def even_*(i: Int) = i % 2 == 0
    even_*(30)
//             OR
  def even_?(i: Int) = if(i % 2 == 0) print("even") else print("odd")

  //Writing a method called ODD that takes an Int and returns true if the number is ODD.
    def odd_?(i: Int) = i % 2 != 0
    odd_?(33)
//              OR
  def odd_*(i: Int) = if(i % 2 != 0) print("odd") else print("even")


  //Writing a method called wordsToLower that takes a varargs array of String and returns all the strings in lowercase

    def wordsToLower(words: String*) = words map(_.toLowerCase())
    wordsToLower("TURNTABLE IS A SOFTWARE ENTERPRISE", "ACROSS THE STREET IS A MALL", "HEY WAIT FOR ME")

  //Writing a method called even2 that takes an Int and returns true if the number is even
    def even2_?(i: Int) = i % 2 ==0
    even2_?(54)

  //Writing a method isWeekendDay that takes a day as a String and returns true if the day is a weekend.
    def isWeekendDay(Day: String) = Day match {
        case "Saturday" | "Sunday" => true
        case _ => "false"
    }
    //isWeekendDay("Monday")

//Writing a method areWeekendDays that takes a varargs array of Strings and calls isWeekendDay for each one, returning a collection of Boolean
    def areWeekendDays(Days :String*) = Days.map(isWeekendDay)

    //print(areWeekendDays("Friday", "Monday", "Sunday\n"))

    print("\n")
//Using a foreach loop to print out the results of a call to areWeekendDays for some days chosen.
    val a = areWeekendDays("Friday", "Monday", "Sunday")
    a foreach(println)

  //Writing a method displayDetails that takes a String and an Int and prints out the String that number of times.
def displayDetails(age :Int, address: String) = print((address)* age)
    displayDetails(7,  "Yaa")
}
