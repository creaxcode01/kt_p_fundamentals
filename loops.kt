fun main () {

    // première boucle (boucle while)

    var numbstart = 1;

    while (numbstart < 10) {
    println(numbstart)
    numbstart += 2      }
    
    println("Bravo vous êtes sorti de la boucle while ")


    // deuxième boucle (while)

    var num = 1
    while (num <= 100) {
        println(num)
        num *= 2
    }

    println("Bravo vous êtes sorti de la deuxième boucle while ")


    // boucle for

    val chain = listOf("A","B","C","D")
    for (letterr in chain) {
    println("the next letter is $letterr")
    }

    // boucle for 2

    for (y in 1 until 6) { // or try 1..6 -> résultat différent
        println(y)
    }

   println()
   
   // boucle for advance

   for (k in 5 downTo 1 step 2) {
         println(k)
   }

   println();

   // autre 

    val a = 0
    val b = 9
    val c = 3
    for (x in a until b step c) {
        println(x)
    }

    println()


    // autre

    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")

    println()


  // Nested loops (boucles imbriquées)

  
  for (i in 1..5) {
    val numberOfStars = 6 - i
    for (j in 1..numberOfStars) {
        print("*")
    }
    println()
}


 println()
 println()



  // autre manière (nested loops)

  for (numberOfStars in 5 downTo 1) {
    for (i in 1..numberOfStars) {
        print("*")
    }
    println()
}
 
  
  






}

