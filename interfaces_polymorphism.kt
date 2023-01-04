/*

interface Animal 

    class Dog :Animal // empty class   // cela veut dire que la classe Dog hérite d'Animal ( class Dog :Animal)

    fun main() { 
        val dog :Dog = Dog() 
        val dog1 :Animal = dog   // correct ( de le l'interface (parente) vers fille)
        val dog2 :Dog = animal     // false  ( l'inverse fille vers parente, n'est pas possible)
    }  

    False ->  Because Animal cannot be used as Dog or as Animal.
*/










//    Animal       (interface)
//   /      \
//  Dog     Cat  etc

// override = réécriture













interface Animal {  // une interface ne peut pas instancié comme une classe  // Parent

    val breed :String  // déclaration de la variable, sans initialisation
    fun pet()  // déclaration de la méthode sans intilisation
}


class Cat (val name :String, override val breed :String) :Animal                   // hérite de l'interface Animal      Cat est un sous-type d'Animal 
    {
    override fun pet() { // réecriture par rapport à l'interface
        println("Miaouu")
    }
}


class Dog (val name :String, override val breed :String) :Animal                   // hérite de l'interface Animal      Dog est un sous-type d'Animal
{
    override fun pet() { // réecriture par rapport à l'interface
        println("Wouff")
    }

}



 fun pet(animal :Animal) { // utilise une classe liée a l'interface Animal comme argument Cat/Dog
    println("Petting ${animal.breed}") // {} isoler animal.breed
    animal.pet()
} 




fun checkAnimalIsDog(animal :Animal) { // l'interface Animal en tant que paramètre

    if (animal is Dog) {
    println("It is a dog")
    } 
    else
    {
        println("It is not a dog")


    }
   


}

fun main() {
    pet(Cat("Jake","British Shorthair"))
    pet(Dog("Cookie", "Border Collie"))
    checkAnimalIsDog(Cat("Norman","Korat"))
    checkAnimalIsDog(Dog("Rupper", "Golden Retriever")) 
}
