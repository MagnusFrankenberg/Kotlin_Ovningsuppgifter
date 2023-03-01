package ÖvningsUppgifter.Uppg_2_Loopar

/*
Uppgift 2b– For-loopar
Skriv en funktion som listar godtycklig del av godtycklig multiplikationstabell
Inparametrar ska vara:
• En int x som talar om vilken multiplikationstabell som ska listas
• Det lägsta tal som x ska multipliceras med
• Det högsta tal som x ska multipliceras med
*/

fun main() {

    fun listmultiplikationstabell(x:Int, low:Int,high:Int){
        for(i in low..high){
            println("$x x $i = "+x*i)
        }
    }
    listmultiplikationstabell(9,1,10)

}