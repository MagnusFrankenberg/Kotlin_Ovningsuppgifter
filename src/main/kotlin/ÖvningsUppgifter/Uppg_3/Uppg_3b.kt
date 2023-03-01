package ÖvningsUppgifter.Uppg_3

/*
Uppgift 3b - Gissa talet, med exceptions
När ni anropar readLine()!!.toInt(), vid inläsning av tal, finns risk för att NumberFormat Exception
kommer att kastas. Detta sker om det som skrivs in inte är en siffra.
Lägg till ett try-catch-block som fångar NumberFormatException och säger åt användaren att skriva in
en siffra när detta fel har inträffat
Kolla att ditt spel funkar fint och att användaren får sitt felmeddelande och kan fortsätta spela även om
NumberFormatException har inträffat
*/


fun main() {


    var gissning:Int = 0

    while (true) {
        val tal:Int =(1..10).random()
        println("Gissa ett tal 1-10")

        gissning = takeInput()
        while(gissning==-1) {
            gissning = takeInput()
        }

        while (gissning != tal) {
            if (gissning < tal) println("Gissa högre")
            if (gissning > tal) println("Gissa lägre")
            gissning = takeInput()
            while(gissning==-1) {
                gissning = takeInput()
            }
        }

            println("Rätt! Spela igen?(ja)")
        if(!readLine().equals("ja")) break
        }

    println("Hej Då")
}

fun takeInput():Int{
        try {
            return readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("Du måste ange ett tal, försök igen:")
        }
        return -1
    }





