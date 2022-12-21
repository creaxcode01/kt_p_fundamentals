fun main() {
    
    val weekday = "Saturday"
    val hour = 8
    val storeName = "Little Lemon"
    

    when (weekday) {   // remplace case de Java
        "Monday" -> println("8 AM to 12 PM")
        "Tuesday" -> println("8 AM to 6 PM")
        "Wednesday" -> println("8 AM to 5 PM")
        "Thursday" -> println ("4 AM to 5 PM")
        "Friday" -> println("8 AM to 12PM")
        "Saturday" -> println("6 AM to 8 PM")
        "Sunday" -> println("10 AM to 12 AM")
        else -> println("This day doesn't exist")

        


    }


    

    /* 
    println("On $weekday, the opening hours are:")
    
    if (weekday == "Monday") {
        println("8 AM to 12 PM") 
    }
    
    else if (weekday == "Tuesday") {
        println("8 AM to 6 PM") 
    }   
    
    else if (weekday == "Wednesday") {
        println("8 AM to 5 PM")
    }
    
    else if (weekday == "Thursday") {
        println("4 AM to 5 PM")
    }
    
    else if (weekday == "Friday") {
        println("3 AM to 5 PM")
    }
    
    else if (weekday == "Saturday") {
        println("6 AM to 8 PM")
    }
    
    else if (weekday == "Sunday") {
        println("10 AM to 12AM")
    }
        
     */  

    

     val isOpen = when (weekday) {  //boolean
        "Monday" -> hour in 8..12   // "Monday" -> hour >= 8 && hour <= 12
        "Tuesday" -> hour in 8..6
        "Wednesday" -> hour in 8..5
        "Thursday" -> hour in 4..5
        "Friday" -> hour in 3..5
        "Saturday" -> hour in 6..8
        "Sunday" -> hour in 10..12
        else -> false               // boolean
     }

     if(isOpen) {                      // boolean
        println("$storeName is open")
     }
     else {
        println("$storeName is closed")
     }
     
    
   
}