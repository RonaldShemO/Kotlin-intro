fun main(args: Array<String>) {
    //IF STATEMENTS
    var age = 20
    if (age < 18) {
        println("You are underage")
    } else {
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <=24){
        println("Normal Weight")
    }else if (bmi <=29){
        println("Underweight")
    }else{
        println("Obese")
    }

    // WHEN STATEMENTS
    var bettingNumber = 0
    when(bettingNumber){
        1 -> {
            println("Busted")
        }
        2 -> {
            println("Busted")
        }
        3 -> {
            println("Cashed Out")
        }
        4 -> {
            println("Busted")
        }
        else->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }
}
