// Fonctions récursives


fun fonctionfactorielle(number :Int) :Int {

  if (number <= 1) {
      return 1
  }                 // else
  return fonctionfactorielle (number - 1) * number  // fonction recursive (s'appelle elle même dans la fonction) 
}



fun main() {
  println(fonctionfactorielle(-1)) //1
  println(fonctionfactorielle(0)) // 1
  println(fonctionfactorielle(1)) // 1
  println(fonctionfactorielle(2)) // 2
  println(fonctionfactorielle(3)) // 6
  println(fonctionfactorielle(4)) // 24
  println(fonctionfactorielle(5)) // 120
  println(fonctionfactorielle(6)) // 720
}

/* examples fonctions factorielles

factorial(3) ->
(factorial(2) * 3) ->
((factorial(1) * 2) * 3) ->
((1 * 2) * 3) ->
(2 * 3) ->
6



*/



/* private fun infiniteRecursion() {    // no parameters
    println("infinite loop")
    infiniteRecursion()   // recursivité la même méthode dans la même fonction
                          // s'appelle elle même

    
} */