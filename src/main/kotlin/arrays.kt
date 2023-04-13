fun main(args: Array<String>) {
    var names = arrayListOf("Yvonne", "Shem", "Dennis", "James", "Messi")
    println(names[2])
    // Use for in loop to print
    for (i in 0 until (names.size -1)){
        println(names[i])
    }
    //  You can use a foreach loop as well
    names.forEach{
        println(it)
    }
}

