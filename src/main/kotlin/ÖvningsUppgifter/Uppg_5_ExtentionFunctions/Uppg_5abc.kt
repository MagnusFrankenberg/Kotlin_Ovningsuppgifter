package ÖvningsUppgifter.Uppg_5_ExtentionFunctions

/*Uppgift 5a – Extension functions
Skapa klassen Rectangle som har följande parametrar
• Bredd
• Höjd
Nackademin Yrkeshögskola • Tomtebodavägen 3a • 171 65 Solna • Tel +46 8 466 60 00 • E-post info@nackademin.se s.5/ 10
Skapa extension functions till Rectangle som beräknar
• Area
• Omkrets
Gör ett huvudprogram där du
• Skapar en Rectangle
• Skriver ut area och omkrets som du beräknar i dina funktioner

Uppgift 5b – Extension functions
Skapa följande extension functions för String:
DoubleUp() - Skriver ur en String två gånger

Uppgift 5c – Extension functions
Skapa följande extension functions för String
PrintRepeat(i : Int) - Skriver ur en String i antal gånger*/


class Rectangle(var bredd:Int, var höjd:Int)

fun Rectangle.area() = this.bredd * this.höjd
fun Rectangle.omkrets() = this.bredd*2 + this.höjd*2

fun uppg5a(){
    val rec1 = Rectangle(6,8)
    println("Area: ${rec1.area()}, Omkrets: ${rec1.omkrets()}")
}




fun String.doubleUp() = println("$this $this")
fun uppg5b(){
    "Magnus".doubleUp()
}



fun String.printRepeat(i:Int){
    for(i in (1..i))print("$this, ")}
fun uppg5c(){
    "Upprepas".printRepeat(8)
}




fun main(){
    //uppg5a()
   // uppg5b()
    uppg5c()
}