package ÖvningsUppgifter.Uppg_9_HögreOrdnFunk

/*
Uppgift 9 – Högre Ordningens Funktioner – Generiska funktioner
• 9a Skriv en egen version av funktionen ”filter”
• 9b Skriv en egen version av funktionen ”map”
o Använder inte predicate utan function (T) -> (T)
*/

val myList = listOf<Int>(1,2,3,4,5,6,7,8,9)
val myList2 = listOf<String>("a","ab","abc","mdef","magnus","ugm")

    fun main(){
        myList.myfilter { it>5 }.forEach { println(it) }
        myList2.myfilter { it.contains("ma") }.forEach { println(it) }

        myList.myMap {i->i*2  }.forEach { println(it) }
        myList2.myMap {s-> s+s}.forEach { println(it) }

    }

//9a: min egen filter
fun <T> List<T>.myfilter (predicate: (T)->Boolean):List<T>{
    val outList = mutableListOf<T>()
    for(element in this){
        if(predicate(element))
            outList.add(element)
    }
    return outList
}


//9b: min egen map
fun <T,R> List<T>.myMap (function:(T)->(R)):List<R>{
    val outList = mutableListOf<R>()
    for(element in this){
        outList.add(function(element))
    }
    return outList
}