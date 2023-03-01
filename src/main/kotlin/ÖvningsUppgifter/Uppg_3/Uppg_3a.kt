package ÖvningsUppgifter.Uppg_3

//Uppgift 3a - Gissa talet
//Gör ett litet program där du väljer ut ett random värde mellan 1 och 10.
//Låt användaren gissa talet
//Skriv ut ”Högre” eller ”Lägre” tills användaren har gissat rätt.
//Fråga sen användaren om hen vill spela igen


fun main() {

    var gissning:Int=0

    while (true) {
        val tal:Int =(1..10).random()
        println("Gissa ett tal 1-10")

        gissning = readLine()!!.toInt()

        while (gissning != tal) {
            if (gissning < tal) println("Gissa högre")
            if (gissning > tal) println("Gissa lägre")
            gissning = readLine()!!.toInt()
        }

            println("Rätt! Spela igen?(ja)")
        if(!readLine().equals("ja")) break
        }

    println("Hej Då")
}





