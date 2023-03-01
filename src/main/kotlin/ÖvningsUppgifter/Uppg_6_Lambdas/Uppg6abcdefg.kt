package ÖvningsUppgifter.Uppg_6_Lambdas

/*
Uppgift 6a – Lambdas
Bygg ut djurklasserna i övningsuppgift 4:
Gör om utskriften av listan så att du använder en lambda för att skriva ut djuren
Testa minst 2 olika sätt att skriva ut.

Uppgift 6b – Lambdas
Skriv en funktion som tar en lista av olika djur och gör om alla djuren till grodor. Använd lambdas för
detta

Uppgift 6c – Lambdas
Skriv en funktion som tar en lista av djur och sorterar bort alla spindlar (Eller någon annan sorts djur
som du har i din lista)

Uppgift 6d – Lambdas
Skriv en funktion som kollar om det finns några katter i din lista. Testa både med en sorts djur som
finns i listan och en sort som inte finns

Uppgift 6e – Lambdas
Skriv en funktion som hittar det högsta antalet ben som ett djur i listan har (viss googling kan behövas
för funktionen som hittar max-värdet)

Uppgift 6f – Lambdas
Skriv en funktion som summerar antal ben djuren har (viss googling kan behövas för funktionen som
hittar max-värdet)

Uppgift 6g – Lambdas
Skriv en funktion som berättar hur många insekter som finns i listan (det är djur med fler än 4 ben)
Nackademin Yrkeshögskola • Tomtebodavägen 3a • 171 65 Solna • Tel +46 8 466 60 00 • E-post info@nackademin.se s.6/ 10

Uppgift 6h – Lambdas
Skriv en funktion som fördubblar antalet djur i den lista den returnerar. (Kräver ingen lambda)
*/

import ÖvningsUppgifter.Uppg_4_Klasser.Djur

var d1 = Djur("Råtta", 4)
var d2 = Djur("Myra",6)
var d3 = Djur("Spindel", 8)
var d4 = Djur("Hund", 4)
var d5 = Djur("Delfin",0)
var d6 = Djur("Katt",4)
var d7 = Djur("Orm",0)
var d8 = Djur("Ödla",4)
var d9 = Djur("Apa",2)
var d10 = Djur("Anka",2)
var d11 = Djur("Fluga",6)
var d12 = Djur("Tusenfoting",100)



 val djurlist = listOf(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12)
 fun uppg6a() {

     djurlist.forEach { d -> println("Djur: ${d.sort}, Ben: ${d.antalBen}") }
     println("---")
     djurlist.stream().map {it.sort}.forEach{p->println(p)}
     println("---")
     djurlist.stream().map {it.sort}.sorted().forEach{p->println(p)}
 }


val djurlist2 = mutableListOf(d1,d3,d5,d7)
fun uppg6b(list: List<Djur>){
    list.forEach{d-> d.printAll() }
    list.map { djur->djur.sort="Groda"; djur.antalBen=4 }
    println("---")
    list.forEach{d-> d.printAll() }
}

val djurlist3 = listOf(d1,d3,d5,d3,d6,d3,d7,d3,d8,d3)
fun uppg6c(list: List<Djur>){
    list.filterNot { d->d.sort.equals("Spindel") } .forEach{d-> d.printAll()}
}


fun uppg6d(list: List<Djur>,sökord:String){
    println( list.any { d->d.sort.equals(sökord) })
}

fun uppg6e(list: List<Djur>){
    println(list.maxOf { d->d.antalBen })
    list.filter { d->d.antalBen==list.maxOf { d->d.antalBen } }.forEach{x-> x.printAll() }
}

val djurlist4 = listOf(d1,d2,d3)
fun uppg6f(list: List<Djur>){
    println("Summa ben: "+list.map { d->d.antalBen }.sumOf { it })
}

fun uppg6g(list: List<Djur>){
    println("Antal djur med 6+ ben: "+ list.filter { d->d.antalBen>=6 }.count())
}

fun uppg6h(list: List<Djur>){
     list.plus(list.subList(0,list.size)).forEach{d->d.printAll()}
}



     fun main() {
        // uppg6a()
        // uppg6b(djurlist2)
        // uppg6c(djurlist3)
        // uppg6d(djurlist,"Katt")
        // uppg6e(djurlist)
        // uppg6f(djurlist4)
        // uppg6g(djurlist)
         uppg6h(djurlist4)
     }
