/* class Compte {
    private var balance: Double = 0.0

    constructor()
    constructor(initialBalance: Double) {
        this.balance = initialBalance
    }

    fun getBalance(): Double = this.balance
    fun deposit(montant: Double) {
        this.balance += montant
    }

    fun retirer(montant: Double) {
        this.balance -= montant
    }

    fun ajoutInternet(tauxInternet: Double) {
        this.balance *= (1 + tauxInternet)
    }
}

fun main(){
    val compte=Compte(100.0)
    compte.deposit(500.0)
    compte.retirer(200.0)
    compte.ajoutInternet(0.05)
    println("Le solde actuel est : ${compte.getBalance()}")
} */

import java.time.LocalDate
import java.time.format.DateTimeFormatter
class Employe(
    private var matricule:Int,
    private var nom:String,
    private var prenom:String,
    private var anneeEmbauche:Int,
    private var salaire:Double
){}

constructor(vmatricule:Int,  Nom:String ,Prénom:String , anneEmbauche:Int,  Salaire:Double):
        this(matricule,nom,prenom,anneeEmbauche,salaire){
            this.anciennete = getAnciennete(anneeEnCours)
    this.salaire=getAugmentationDuSalaire(this.anciennete)
        }
