package ÖvningsUppgifter.Uppg_7_Rekursion

/*Uppgift 7f – Rekursion, fibonacci
Betrakta Fibonacci-demon i facit. Fibonacci-talen är en sekvens där varje nytt tal räknas ut genom att
addera de två föregående talen i sekvensen, De första talen är 1 och 2
Sekvensen blir: 1, 2, 3, 5, 8, 13, 21 …
Kopiera exemplet och skriv om
Man ska kunna ange en siffra som betecknar ett index i fibonnacci-sekvensen som inparameter till din
funktion
Ditt program ska sedan skriva ut vilket fibonacci-tal som är på den plats som motsvarar det tal du
skickade in*/

//1,2,3,5,8,13,21,34,55 etc
fun main() {

    tailrec fun fib(prevPrev: Int, prev: Int, i : Int) {
        val next = prevPrev + prev
        when  {
            (i == 0) -> println(1)
            (i == 1) -> println(2)
            (i-2 == 0) -> println(next)
        }
        if (i <= 2) System.exit(0)
        fib(prev, next, i -1)
    }

    println(fib(1, 2, 5))
}



