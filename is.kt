

interface Animal






class Dog (val name :String) :Animal {
    fun retrieve(item :String) {
        println("Retrieving $item")
    }
}


class Cat (val name :String) :Animal {
    fun pet(){
        println("Mrr")
    }
}


class Squirrel (val name :String) :Animal {
    fun lookForFood() {
        println("schrimp, schrimp")
    }
}


class Catfish (val name :String) :Animal {

    fun eatPinkies() {
        println("Miam miam these pinkies are wonderful")
    }

}





fun play (animalus :Animal) {
    when (animalus) {   // remplace case de Java
        is Dog -> animalus.retrieve("stick")
        is Cat -> animalus.pet()
        is Squirrel -> animalus.lookForFood()
        is Catfish -> animalus.eatPinkies()
    }
}







fun main() {
    play(Dog("Rex")) // Retrieving stick
    play(Cat("Garfield")) // Mrr
    play(Squirrel("Alexandre")) // schrimp, schrimp
    play(Catfish("Jorge"))
}

