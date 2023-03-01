package ÖvningsUppgifter.Uppg_2_Loopar

/*
Uppgift 2a– For-loopar
Skriv en funktion som listar alla jämna tal mellan 1 och 20, baklänges. Använd modulu
*/

fun main() {

   /* var list = (20.. 1).toList()
    for (e in list ){
        if((e % 2) == 0) println(e)
    }*/

    for(i in 20 downTo 1){
        if((i % 2)==0) println(i)
    }


}