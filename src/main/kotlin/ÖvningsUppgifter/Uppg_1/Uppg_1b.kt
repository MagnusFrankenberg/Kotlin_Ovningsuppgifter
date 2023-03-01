package ÖvningsUppgifter.Uppg_1

/*Uppgift 1b– Videobandspelaren, forts
Betrakta din lösning av uppgift 1a, liknar den kod du brukade skriva i Java? Låt oss nu närma oss en
mer funktionell stil att programmera.
• Om du har funktioner som är skrivna med krullparenteser, kan du skriva om dem med
kortnotation (=)?
• Använder du var där du hade kunnat ha val? Använd alltid val där det funkar!
• Står dina funktioner uppradade ovanför main? Släng in dem i main! Functions are first class
citizens.
• Finns det saker som hade kunnat göras på en rad, men som nu görs på flera rader? (Det är
inte alltid rätt med allt på en rad, men testa att slå ihop funktionaliteten där det är rimligt
och se hur det känns.)*/

fun main() {

    val totalCapacity: Int = 145
    val usedLength: Int = 45
    val startH:Int = 18
    val startMin:Int = 45
    val endH:Int = 20
    val endMin:Int = 30




    fun isEnoughSpace(totalCapacity:Int,usedLength:Int,startH:Int,endH:Int,startMin:Int,endMin:Int):Boolean =((totalCapacity-usedLength)-((endH-startH)*60 + (endMin-startMin)))>=0

    println(isEnoughSpace(145,40,18,20,45,30))

}