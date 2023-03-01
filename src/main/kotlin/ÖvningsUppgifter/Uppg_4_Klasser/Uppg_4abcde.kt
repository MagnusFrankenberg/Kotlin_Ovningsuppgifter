package ÖvningsUppgifter.Uppg_4_Klasser

/*Uppgift 4a– Klassen Djur
Skapa en klass ”Djur” som har en
• String ”Sort”
• Int ”antalBen”
• Skapa getters och setters för alla variabler
Gör metoder för att skriva ut
• Djurets sort
• Antal ben
• All info om ett djur
I ditt huvudprogram
• Skapa upp ett antal djur
• Skriv ut vilka djur du har och antal ben för varje djur

Uppgift 4b– Listor med Djur
Modifiera ditt huvudprogram så att du:
• Skapa upp ett antal djur och lägg i en lista
• Skriv ut vilka djur du har och antal ben för varje djur genom att iterera över listan

Uppgift 4c– Set med Djur
I ditt djur-program, skapa upp två olika Set.
• Ett Set som innehåller alla djur, flera gånger om
• Ett Set som innehåller ett ex av varje djur, men i annan ordning än i det första Set:et
• Skriv ut alla djur i Set1
• Notera att varje djur bara finns med en gång i din utskrift
• Skriv ut alla djur i Set2
• Skriv ut resultatet av Set1.equals(Set2)
• Är de lika eller inte?

Uppgift 4d – Map med Djur
I ditt djur-program, skapa upp en map över dina djur
• Låt djurets namn vara nyckel (du hittar på namn till dem)
• Låt själva djurobjektet vara värdet i mappen
• Skriv ut alla djur i din mapp

Uppgift 4e – When
Skapa en funktion som tar ett Djur som inparameter. Beroende på Djurets sort ska du skriva ut djurets
läte. Använd en When-sats (Kotlins motsvarighet till Switch)*/


class Djur(sort:String,antalBen:Int){
   var sort:String = sort
       get()=field
       set(value){
           field=value
       }

    var antalBen:Int=antalBen
        get()=field
        set(value){
            field=value
        }

    fun printDjurSort(){
        println(sort)
    }
    fun printAntalBen(){
        println(antalBen)
    }
    fun printAll(){
        println("Sort: $sort, Antal Ben: $antalBen")
    }
}

var d1 = Djur("Råttor", 4)
var d2 = Djur("Myror",6)
var d3 = Djur("Spindlar", 8)
var d4 = Djur("Hundar", 4)
var d5 = Djur("Delfiner",0)

fun uppg_4a(){
    d1.printDjurSort()
    d1.printAntalBen()
    d2.printDjurSort()
    d2.printAntalBen()
    d3.printDjurSort()
    d3.printAntalBen()
    d4.printDjurSort()
    d4.printAntalBen()
    d5.printDjurSort()
    d5.printAntalBen()
}

fun uppg_4b() {

    var djurLista = listOf(d1, d2, d3, d4, d5)

    for (djur in djurLista) {
        djur.printAll()
    }
}

fun uppg_4c() {
    val djurSet1 = setOf(d1, d2, d3, d4, d5, d1, d2, d3, d4, d5, )
    val djurSet2 = setOf(d3, d4, d5, d1, d2)

    for (djur in djurSet1) {
        djur.printAll()
    }
        println("---------")

        for (djur in djurSet2) {
            djur.printAll()
        }
    println("---------")
    println(djurSet1.equals(djurSet2))

    }

fun uppg_4d(){
    val djurMap = mapOf("Arne" to d1, "Britta" to d2,"Doris" to d3,"Elsa" to d4, "Frank" to d5)

    for((k,v) in djurMap){
        println(k+", är av sorten "+v.sort+", och har "+v.antalBen+" ben.")
    }
}

fun uppg_4e(djur: Djur){

    when(djur.sort){
        "Råttor"->println("Piip")
        "Myror"->println("hello, jag är en myra")
        "Spindlar"->println("imse vimse")
        "Hundar"->println("voff")
        "Delfiner"->println("Tjena, jag är en delfin")
    }
}

    fun main() {

      //  uppg_4a()
      //  uppg_4b()
      //  uppg_4c()
       // uppg_4d()
        uppg_4e(d2)

    }
