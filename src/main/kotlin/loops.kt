fun main(args: Array<String>) {
    // 1. WHILE LOOPS
        // while loop
    var counterOne = 0
    while (counterOne <=5){
        println(counterOne)
        counterOne++
    }
        // do while loop
    var counterTwo = 10
    do{
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)
    // 2. FOR LOOPS
        //for in loop
    for(num in 20 .. 25){
        println(num)
    }

    for (num2 in 50 downTo 45){
        println(num2)
    }

        //for each loop
    var names = listOf("shem", "Daniel", "Jamo", "Mark", "Rashford")
    names.forEach {
        println()
    }
    // 3. REPEAT LOOP
    repeat(times = 5 ){
       println("Hello World")
    }
}