

fun main() {

val accountType :Any = "free"
var accountType2 :String = "blabla"  //choose paid or free or others


val charOne :Char = 'A'
val charTwo :Char = 'B'
val charThree :Char = 'C'

val stringAssembly :String = charOne.toString() + charTwo.toString() + charThree.toString()

val secretPassword = "ABCDE"
// val intOne = 110
// val intToDouble = intOne.toDouble()



// if

if (accountType == "free") {

    println("Show ads")
}

// if else if else

if (accountType2 == "free") {
    accountType2 = "Free account"}
    else if (accountType2 == "paid") {
        accountType2 = "Paid account"
    }
    else {
        accountType2 = "Unknown account"
    }
    println(accountType2)



//when statement

when (accountType) {
    is String -> println("This is a String")
    is Int -> println("This is an Int")
    is Double -> println("This a Double")
    is Boolean -> println("This is a Boolean")
    is Any -> println("This is Any")
}



when {

    secretPassword == "" -> println("you cannot use an empty password")
    secretPassword.length <= 3 -> println("this password is too short")
    secretPassword.length >= 4 -> println("this password is in accordance")
    secretPassword.length <= 8 -> println("this password is in accordance")
    secretPassword.length >= 9 -> println("this password is too long")
    else -> println("Error")
}

/* = à when {

    secretPassword == "" -> {
        println("you cannot use an empty password")

    }
    
    secretPassword.length <= 3 -> {
        println("this password is too short")

    }

    secretPassword.length >= 9 -> {
        println("this password is too long")

    }

    else -> { 
        println("Error")
    }



}
*/



// println


println(stringAssembly)

println(stringAssembly.length)






}