private val Unit.size: Any
    get() {}

//EX1
fun main() {
    class voiture {
        var marque: String = ""
        var modele: String = ""
        var vitesse: Int = 0

        constructor() {
        }

        constructor(marque: String, modele: String, vitesse: Int) {
            this.marque = marque
            this.modele = modele
            this.vitesse = vitesse
        }
    }

    var v1 = voiture("Peugeot", "308", 0)
    var v2 = voiture("Volvo", "V50", 0)
    println(v2.modele)
    v2.vitesse += 40
    v1.vitesse += 60
    println(v1.vitesse)
    println(v2.vitesse)

    class nombre {
        var nb: Int = 0

        constructor() {
        }

        constructor(Nombre: Int) {
            this.nb = Nombre
        }
    }

    var nb1 = nombre(5)
    fun diviseurs(nb: Int) {
        val divList = mutableListOf<Int>()

        for (i in 1..(nb - 1)) {

            if (nb % i == 0) {

                divList.add(i)
            }
            return diviseurs(9)
        }


        fun estPremier(nombre: Int): Boolean = if (diviseurs(nb).size == 2) true
        else false
        println(estPremier(5))


        fun sommeChiffres(nombre: Int): Int {
            var somme = 0
            var nb = nombre
            while (nb != 0) {
                somme += nb % 10
                nb /= 10
            }
            return somme
        }
    }
}
