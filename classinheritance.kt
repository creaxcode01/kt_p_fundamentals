
/*
   open class P { 
        fun a() {} 
    } 
    
    class C :P () { 
        fun b() {} 
    } 
Class D :P () {
fun e() {
}
}
    fun main() { 
        val o = C() 
       // here 
    }  

-> C hérite des méthodes a() et b() seulement
*/










/*  open class Dog(val name: String)

class Labrador(name: String) : Dog(name)

fun main() {
    val lab = Labrador("Coco")
    println(lab.name) // Coco
}  */




open class Mammal {            // open != final, permet d'hériter de cette class
    fun feedChildren() {

    }
}

class Dog :Mammal {      // Dog hérite de la super class Mammal
    fun fetchStick() {

    }
}

fun feed(mammal :Mammal) { // instanciation objet comme paramètre
    mammal.feedChildren()

}

fun main(){
    Dog().feedChildren()
    Dog().fetchStick()
    feed(Dog())

}
