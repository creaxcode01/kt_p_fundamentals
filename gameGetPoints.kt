

fun getPoints(basePoints :Int, boost :Int) :Int {
    return basePoints * boost

}




fun factorial(number :Int) :Int {
    var accumulator = 1
    for (i in 1..number) {
        
        accumulator = accumulator * i
    }

    return accumulator
}






fun main() {
        var score = 0;
    println(score)
        score += getPoints(10, 1)  // += 
    println(score)
        score += getPoints(20, 2)
    println(score)
        score += getPoints(-10, 1)
    println(score)
        score += getPoints(5, 3)
    println(score)
        score += getPoints(-15, 2)

        // accumulator

    println(factorial(1)) //1
    println(factorial(2)) //2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720

    }


