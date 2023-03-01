package ÖvningsUppgifter.Uppg_2_Loopar

/*
Uppgift 2c– For-loopar
Skriv en funktion som räknar ut om ett givet tal är ett primtal. Returnera true eller false.
*/

fun main() {

    fun ärPrimTal(x:Int):String{
        if(x==1) return "$x är inte ett PrimTal"
        for(i in 2..(x-1)){
            if(x%i == 0) return "$x är inte ett PrimTal"
        }
    return "$x är ett PrimTal"
    }

    println(ärPrimTal(1))
    println(ärPrimTal(2))
    println(ärPrimTal(3))
    println(ärPrimTal(4))
    println(ärPrimTal(5))
    println(ärPrimTal(6))
    println(ärPrimTal(7))
    println(ärPrimTal(8))
    println(ärPrimTal(9))
    println(ärPrimTal(10))
    println(ärPrimTal(11))
    println(ärPrimTal(12))
    println(ärPrimTal(13))
}