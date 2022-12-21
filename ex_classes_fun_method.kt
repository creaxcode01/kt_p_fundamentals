class Player (
    val name :String,
    val surName :String,
    val otherName :Any,
)

{ // body de la classe Player

    fun fullName() :String {                                           // a besoin d'être instancé comme objet class Player pour pouvoir être utiliser
        var returnphrase :String = this.name + " " + this.surName
        return returnphrase
    }

}





 fun main() {
    var player1 = Player("Antony", "ToTo")  // instanciation (objet) de la classe Player
    println(player1.fullName())
 }