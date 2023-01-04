/* 
Exemples de functions


   fun a() { 
        print("A") 
    } 

    fun b() { 
        print("B") 
        a() 
    } 

    fun c() { 
        b() 
        print("C") 
        b() 
    } 

    fun d() {
        c()
        print("D")
        c()
    }
  
    fun main() { 
        c() 
    } 


*/

fun helloFabien () {  // no parameter, no return (void en java)
    val word1 :String = "Hello"
    val word2 :String = "Fabien"
    println ("$word1 $word2")
}

fun helloFabienne() {   // no parameter, no return (void)
    var word1 = "Hello"
    var word2 = "Fabienne"
    println("$word1 $word2")
}


fun storeprintln(storeName :String) {   // one parameter, no return (void)
    println("the name of the store is : $storeName")

}


fun addition (numb1 :Int, numb2 :Int) :Int {  // two parameters, a return
    val result = numb1 + numb2
    println("le résultat de l'addition est : $result")
    return result  // return met automatiquement fin à la fonction
}



fun multiplyByTwo(numb :Int) :Int {   // one paramater, return
    val result = numb * 2
    println(result) 
    return result               // return met automatiquement fin à la fonction
 
}


fun biggerOf(a :Int, b :Int) :Int {
    if (a>b) {
        return a
    }
    else if (b>a) {
    return b
    }
    else 
    return 0     // return met automatiquement fin à la fonction
}




fun biggerOfTwo(a :Int, b :Int) :Int {
    return if (a>b) a else b (condition de forme plus courte)
}











fun main () {
    println()
    helloFabien()
    println()
    helloFabienne()
    println()

    storeprintln("JapanStore")   // méthode qui appelle une fonction avec un argument

    addition(12,13)   // méthode qui appelle une fonction avec deux arguments

    multiplyByTwo(4)    // méthode qui appelle une fonction avec un argument

    println(biggerOf(15,18))
    println(biggerOfTwo(15,18))

    
}