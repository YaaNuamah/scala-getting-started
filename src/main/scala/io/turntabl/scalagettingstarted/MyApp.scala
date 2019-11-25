package io.turntabl.scalagettingstarted

object MyApp extends App {
    val first: String = "Yaa"
                  val town: String = "Dansoman"
                    print("Yaa\nwas\nborn\nin\nDansoman\n")

    def threetimes(i: String) = i * 3
    print(threetimes("hello"))
    print("\n")

    def even_*(i: Int) = i % 2 == 0
    even_*(30)

    def odd_?(i: Int) = i % 2 != 0
    odd_?(33)


    def even_?(i: Int) = if(i % 2 == 0) print("even") else print("odd")

    def odd_*(i: Int) = if(i % 2 != 0) print("odd") else print("even")

    def wordsToLower(words: String*) = words map(_.toLowerCase())

    wordsToLower("TURNTABLE IS A SOFTWARE ENTERPRISE", "ACROSS THE STREET IS A MALL", "HEY WAIT FOR ME")

    def even2_?(i: Int) = i % 2 ==0
    even2_?(54)

    def isWeekendDay(Day: String) = Day match {
        case "Saturday" | "Sunday" => true
        case _ => "false"

    }
    isWeekendDay("Monday")


    def areWeekendDays(Days :String*) = Days.map(isWeekendDay)

    print(areWeekendDays("Friday", "Monday", "Sunday\n"))

    print("\n")

    val a = areWeekendDays("Friday", "Monday", "Sunday")
    a foreach(println)

def displayDetails(age :Int, address: String) = print((address)* age)
    displayDetails(7,  "Yaa")
}
