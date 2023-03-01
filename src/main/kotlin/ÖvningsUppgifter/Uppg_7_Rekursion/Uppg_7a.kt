package ÖvningsUppgifter.Uppg_7_Rekursion

import kotlin.math.round

/*Uppgift 7a – Rekursion, ränta på ränta
Skriv en rekursiv funktion beräknar hur mycket ränta du får efter et viss antal år.
Inparametrar till funktionen är
• Initialt belopp
• Antal år
• Ränta
Lite inspo till hur den rekursiva metoden kan byggas upp:
• Du sätter in 100 kr med 10% ränta
• Efter ett år har du 100*1,1 = 110 kr
• Nästa år har du (100*1,1 )*1,1 = 121
• Efter 3 år har du ((100*1,1 )*1,1)*1,1 = 133,10
• Efter 5 år har du ((((100*1,1 )*1,1)*1,1)*1,1)*1,1) = 161,05
(Det går utmärkt att skriva en ränteuträknings-metod som inte är rekursiv, men nu är det rekursivitet
som är övningen)*/

fun main() {

    //Klassisk rekursion
    fun ackumuleradRänta(startBelopp: Double, år: Int, ränta: Double): Double {

        if (år < 1) return startBelopp
        return (1 + (ränta / 100.0)) * ackumuleradRänta(startBelopp, år - 1, ränta)
    }

    println(round(ackumuleradRänta(100000.0, 5, 10.0)))



    //Ackumulativ Rekursion
    fun ackRänta(startBelopp: Double, år: Int, ränta: Double): Double {

        fun ackRäntaInner(acc: Double, år: Int): Double {
            if (år < 1) return acc * startBelopp
            else return ackRäntaInner((1 + (ränta / 100.0)) * acc, år - 1)
        }
        return ackRäntaInner(1.0, år)
    }
    println(round(ackRänta(100000.0, 5, 10.0)))

}





