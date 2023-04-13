package oop

fun main(args: Array<String>) {
    var p1 = Person("Shem", "100")
    // Request salary and residence through access modifiers
    p1.setSalary(3000000.00)
    p1.setResidence("Nairobi")
    // Print salary and residence through access modifiers
    println(p1.getSalary())
    println(p1.getResidence())
}

class Person(var name:String, var age:String) {
    private var salary: Double = 0.0
    private var residence: String = ""
    fun setSalary(salary:Double){
        this.salary = salary
    }
    fun getSalary():Double{
        return this.salary
    }
    fun walk() {
        println("Yeah, I can walk")
    }
    fun getResidence():String{
        return this.residence
    }
    fun run() {
        println("Yeah, I can run")
    }

    fun setResidence(s: String) {

    }
}
