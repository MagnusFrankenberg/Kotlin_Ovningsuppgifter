package ÖvningsUppgifter.Uppg_8_HögreOrdnFunk

/*Uppgift 8 – Högre Ordningens Funktioner – Text Distortion
Skriv en metod: TextDistortion, som tar in en funktion som i sin tur tar in en String och lämnar ifrån
sig en String. I TextDistorsion anropas funktionen som skickas in som inparameter.
Skriv följande metoder som kan användas som inparametrar till TextDistorsion
• ToUpperCase(String) : String
• RemoveAllDigits(String) : String*/

fun main(){

    TextDistortion(RemoveAllDigits)
    TextDistortion(ToUpperCase)

}
fun TextDistortion(action:(String)->String){
    println("Skriv in en sträng:")
    val s = readLine()!!
    println(action(s))
}

val ToUpperCase: (s:String) -> String = {s->s.uppercase()}
val RemoveAllDigits: (s:String)->String ={it.filterNot { it.isDigit() }
}


