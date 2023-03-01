package ÖvningsUppgifter.Uppg_1

/*Uppgift 1a– Videobandspelaren
Förr när man fortfarande spelade in film på videoband var det ibland svårt att veta om ett kommande
tv-program skulle få plats på bandet.
Skriv ett program som hjälper oss räkna ut om ett band kommer att räcka eller inte.
Programmet ska ha följande 6 värden från start:
• videobandets längd (i minuter),
• hittills använd tid av bandet,
• den tidpunkt då tv-programmet börjar (ange först antal timmar, sedan minuter)
• den tidpunkt då det slutar (ange först antal timmar, sedan minuter).
Vi kan utgå från att programmen alltid börjar och slutar på samma dag
*/


fun main() {

    val totalCapacity: Int = 145
    val usedLength: Int = 40
    val startH:Int = 18
    val startMin:Int = 45
    val endH:Int = 20
    val endMin:Int = 30



    fun programLenghtMin(startH:Int,startMin:Int,endH:Int,endMin:Int):Int{
       return ((endH-startH)*60 + (endMin-startMin))
    }

    fun remainingCapacity(totalCapacity:Int, usedLength:Int):Int{
        return totalCapacity-usedLength
    }

    fun isEnoughSpace(remains:Int, required:Int):Boolean{
        return (remains-required)>=0
    }

    println(isEnoughSpace(remainingCapacity(totalCapacity,usedLength),programLenghtMin(startH,startMin,endH,endMin)))


}