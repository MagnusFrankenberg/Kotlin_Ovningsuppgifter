package ÖvningsUppgifter.Uppg_7_Rekursion

/*
Uppgift 7e – Rekursion, balanserade parenteser
Skriv en rekursiv funktion som tar en sträng och kollar om antalet parenteser är balanserade (att det
finns lika många höger som vänsterparanteser). Returnera true eller false.
Exempel:
• :-) inte balanserad
• ))(( balanserad
*/

fun main() {


    //klassisk rekursion kollar om balanserad))((
    val myString:String = "((jskfg((kdfgk))xdkjhv))"

    fun isBalanced2(str:String,length:Int):Int{

        if(length<1) return 0
        return (if(str[length-1].equals('(')) 1 else if(str[length-1].equals(')')) -1 else 0)+isBalanced2(str,length-1)

    }
    println(if(isBalanced2(myString,myString.length)==0)true else false)





}







