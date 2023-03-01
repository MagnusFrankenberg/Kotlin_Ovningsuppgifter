package ÖvningsUppgifter.Uppg_7_Rekursion

import kotlin.math.*

/*Uppgift 7c – Rekursion, max-värde
Skriv en rekursiv funktion som tar en lista av ints och returnerar maxvärdet av talen i listan*/

fun main() {

    val myList = listOf(2,5,6,4,4,12,34,21,45,73,2,54)

    //klassisk rekursion
    fun sumIntegers(list:List<Int>,size:Int):Int{

        if(size<1) return 0
        return max(list.get(size-1),sumIntegers(list,size-1))

    }
        println(sumIntegers(myList,myList.size))


    //Ackumulativ Rekursion

    fun sumInts(list:List<Int>,size:Int):Int{

        fun innerSumInts(acc:Int,size:Int):Int{
            if(size<1) return acc
            else return innerSumInts(max(list.get(size-1),acc),size-1)
        }
        return innerSumInts(0,size)
    }
    println(sumInts(myList,myList.size))



}







