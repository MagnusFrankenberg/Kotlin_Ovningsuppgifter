package ÖvningsUppgifter.Uppg_7_Rekursion

/*
Uppgift 7b – Rekursion, summering
Skriv en rekursiv funktion som tar en lista av ints och returnerar summan av talen i listan
*/

fun main() {

    val myList = listOf(2,5,5,4,4)

    //klassisk rekursion
    fun sumIntegers(list:List<Int>,size:Int):Int{

        if(size<1) return 0
        return list.get(size-1)+sumIntegers(list,size-1)

    }
        println(sumIntegers(myList,myList.size))


    //Ackumulativ Rekursion

    fun sumInts(list:List<Int>,size:Int):Int{

        fun innerSumInts(acc:Int,size:Int):Int{
            if(size<1) return acc
            else return innerSumInts(list.get(size-1)+acc,size-1)
        }
        return innerSumInts(0,size)
    }
    println(sumInts(myList,myList.size))



}







