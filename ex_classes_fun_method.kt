class Player (                       // header, en tête
    val name :String,
    val surName :String,
    val otherName :Any,
)

{ // body de la classe Player

    fun fullName() :String {                                           // a besoin d'être instancé comme objet class Player pour pouvoir être utiliser
        var returnphrase :String = this.name + " " + this.surName + " " + this.otherName   // this veut dire dans cette classe même
        return returnphrase
    }

}





 fun main() {
    var player1 = Player("Antony", "ToTo", "Cartoon")  // instanciation (objet) de la classe Player
    println(player1.fullName())
 }