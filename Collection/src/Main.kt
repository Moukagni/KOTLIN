//Ex1
/* fun main() {
    val planetes = arrayOf("mercure", "Venus", "terre", "Mars", "Jupiter", "saturne",
        "Uranus", "Neptune")
    println(planetes.first())
    println(planetes.last())
    println(planetes.indexOf("terre"))
    planetes[2] = "Terre"
    println(planetes[2])
    println(planetes.filter{ it.uppercase().startsWith('M') })
    for (planete in planetes){
        println(planete.capitalize())
    }
} */

//Ex2
/* fun main() {
    val entiers = mutableListOf<Int>()
    for (i in 1..10) {
        entiers.add((1..100).random())
    }
    println(entiers)
    val somme = entiers.sum()
    println("Somme : $somme")

    val plusPetit = entiers.min()
    println("Le plus petit est : $plusPetit ")

    val plusGrand = entiers.max()
    println("Le plus grand est : $plusGrand ")

    val listePair = mutableListOf<Int>()
    val listeImpair = mutableListOf<Int>()

    for (nombre in entiers) {
        if (nombre %2 == 0) {
            listePair.add(nombre)
        }else{
            listeImpair.add(nombre)
        }
    }
    println("LIste des nombres paires :")
    for (nombre in listePair) print(nombre)

    println("LIste des nombres impaires :")
    for (nombre in listeImpair) print(nombre)
}
 */

//Ex3
/* fun main () {
    val notes = mutableMapOf<String, MutableList<Int>>(
        "Adrien" to mutableListOf(
            15, 12,
            10
        ), "Bertrand" to mutableListOf(12, 10)
    )
    notes.getOrPut("Toto") { mutableListOf() }.add(8)

    notes.getOrPut("Adrien") { mutableListOf() }.add(6)

    for ((nom, NoteEleve) in notes) {
        val notesFloat = NoteEleve.map { it.toDouble() }
        val moyenne = notesFloat.average()
        if (moyenne >= 10) {

            println("Nom:$nom")
            println("notes:${NoteEleve.joinToString(",")}")
            println("Moyenne : $moyenne")
            println()
        }
        else println("NUL , TA RIEN APPORTÉ")
    }
} */
/* fun main(){
fun serieInverse(n : Int) {
        var serie = arrayListOf<Int>()
        for (i in 1..n) {
            serie += i
        }
    serie.reverse()
    return println("La série inverse $n est : $serie")

    }
    serieInverse(9)
}*/

/* fun main(){
    fun tabPair(tableau:List<Int>):
            List<Int>{
        return tableau.filter { it %2 ==0 }
    }
    val tableauEntiers = listOf(1,2,3,4,5,6,7,8,9,10)
    val resultat=tabPair(tableauEntiers)
    println(resultat)
} */

/* fun main(){
    fun tabImpair(tableau:List<Int>):
            List<Int>{
        return tableau.filter { it %2 !=0 }
    }
    val tableauEntiers = listOf(1,2,3,4,5,6,7,8,9,10)
    val resultat=tabImpair(tableauEntiers)
    println(resultat)
} */

 /* fun main() {
    fun listeDiviseurs(n:Int): List<Int> {
        var diviseurs = mutableListOf<Int>()
        for (i in 1..n) {
            if (n % i == 0) {
                diviseurs.add(i)
            }
        }
        return diviseurs
    }
    println(listeDiviseurs(15))

    fun estPremier(nombre: Int): Boolean = if ( listeDiviseurs(nombre).size == 2) {
        true
    } else {
        false
    }
    println(estPremier(5))
    }
*/

/* fun main(){
    fun estParfait(n:Int): Boolean{
        val parfait = arrayOf(35,450,230,836)
        if ( n in parfait){
            return true
        }
        else {
            return false
        }
    }
    println(estParfait(28))
}*/

/* fun sommeChiffres(n:Int): Int {
    var somme = 0
    var nombre = n
    while (nombre != 0) {
        somme += nombre % 10
        nombre /= 10
    }
    return somme
}

fun main(){

    println(sommeChiffres(125))
}*/

fun main(){
    fun parite(tableau: Array<Int>): MutableMap<String,MutableList<Int>>{
        val list = mutableMapOf<String, MutableList<Int>>("pair" to mutableListOf(),
            "impair" to mutableListOf())
        for ( nb in tableau ){
            if ( nb % 2 == 0 ){
                list.getOrPut("pair") { mutableListOf() }.add(nb)
            }
            else {
                list.getOrPut("impair") { mutableListOf() }.add(nb)
            }
        }
        return list
    }
    println(parite([25]))
}