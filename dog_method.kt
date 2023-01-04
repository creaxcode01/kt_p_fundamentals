/* class Dog (val name :String) {
    var hunger = 62
}

fun feed (dog: Dog) { // instanciation de la class dog comme argument
    println("Feeding ${dog.name}")
    dog.hunger = 0 // va chercher dans la class Dog la valeur hunger
}

fun main () {

    val dog = Dog("Rex")
    feed(dog) // Feeding Rex
    
}   */


class Dog(val name: String) {

    var hunger = 62

    fun feed() {

        val currentDog :Dog = this // pcq feed fait partie de la Class dog

        println("Feeding ${currentDog.name}")

        currentDog.hunger = 0
    }
}

fun main() {

    val dog = Dog("Rex")

    dog.feed() // Feeding Rex
}
