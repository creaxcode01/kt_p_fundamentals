/* Difference between a class, an object, and a type

In Kotlin

 class > object > (type) [a Type is a category of objects (Int,String,Double)]

 all values = objects 
 :String, :Integer = objects

 


 an object is an instantiation (instance) of a class (not abstract)
 a Type is a category of objects (Int,String,Double) (instance of the class Int, etc)

 a class is like a function but does not have return
 a class is a template

 val mark :Employee = Employee()

  / METHOD

 a method is a function in a class not a method alone

*/


// a class could be empty with no header and no body like : 

// public class Empty



class Subject (    // en-tête (header) de la classe Subject
    val name :String,
    val teacher :Teacher,    // ajout  objet de la classe Teacher à Subject
    val isMandatory :Boolean,
)  
           // classe sans body






class Teacher (    // en-tête (header) de la classe Teacher
    val name :String,
    val surname :String,
    val birthday :String,
    val status :String,
)
      // classe avec body

{     // corps (body) de la classe Teacher

    fun goToTheBoard(studName :String = "Hugo") :String {
       val phrase1 :String = "Go the the board $studName "
       return phrase1
    }


}





fun main() {
    // I use named arguments convention here
    val jeanPaul = Teacher (name = "JeanPaul", surname = "JP", birthday = "23.07.1987", status ="ACTIVE") // instanciation de classe Teacher
    val biology1 = Subject (name = "Biology", teacher = jeanPaul, isMandatory = true) //instanciation de classe Object
    println(biology1.isMandatory) // true
    println(biology1.teacher.birthday) // 23.07.1987   // comme teacher a été ajouter en objet dans la classe Subject, il est maintenant utilisable
    println(biology1.teacher.status) // ACTIVE     // comme teacher a été ajouter en objet dans la classe Subject, il est maintenant utilisable
    println(jeanPaul.goToTheBoard()) // fonction dans le body de la classe Teacher

    println(biology1.teacher.goToTheBoard("Nadine"))  // comme teacher a été ajouter en objet dans la classe Subject, la fonction est utilisable depuis biology1(Subject)
    println(biology1.teacher.goToTheBoard(studName = "Nadine"))  // comme teacher a été ajouter en objet dans la classe Subject, la fonction est utilisable depuis biology1(Subject)


}