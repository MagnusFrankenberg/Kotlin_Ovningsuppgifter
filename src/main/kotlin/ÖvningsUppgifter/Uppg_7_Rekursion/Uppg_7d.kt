package ÖvningsUppgifter.Uppg_7_Rekursion

/*Uppgift 7d – Rekursion, max-värde
Skriv en rekursiv funktion som skriver ut en sträng baklänges*/

fun main() {



    val myString:String = "Magnus"

    fun stringBaklänges(str:String,length:Int):String{

        if(length<1) return ""
        return str[length-1]+stringBaklänges(str,length-1)

    }
    println(stringBaklänges(myString,myString.length))





}







