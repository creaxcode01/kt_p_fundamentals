
// Paramètres non défini

fun openBrowser(url :String, incognitoMode :Boolean) {    

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")   // le if (boolean) par défaut est true

    // ...

}


// un seul paramètre défini par défault


fun openBrowser2(url :String, incognitoMode :Boolean = false) {    

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...
    }


// deux paramètres définis par défaut


fun argss(name :String ="Antoine", lastName :String ="LEGUAY") {
    
    println("")
    println("my name is $name and my lastname $lastName")
}


// deux paramètres définis par défaut


fun cheer(how :String = "Hello, ", who :String = "World") {

    println("$how $who")
}




fun main() {

    openBrowser("website1.com", false) // Opening website1.com

    openBrowser("website2.com", false) // Opening website2.com

    openBrowser("website3.com", true) // Opening website3.com in incognito mode


    openBrowser2("food.com")
    openBrowser2("blackbass.com")
    openBrowser2("chatanddate.com", true) 
    



    cheer(how = "Hi ") // Hi World               

    cheer(who = "Learner ") // Hello, Learner   

    cheer(how = "Hi ", who = "Learner ") // Hi Learner    

    cheer(who = "Learner ", how = "Hi ") // Hi Learner

    cheer()   // les deux arguments par défaut


    argss()      // Best -> arguments par défaut
    argss(name = "Martin", lastName = "Duchemin")  // Best -> arguments nommés

}



