package oop

fun main(args: Array<String>) {
    // inheritance and polymorphism
    var std1 = Student("Shem", "shem@gmail.com",
        "shem123")
    var std2 = Student("Sly", "sly@gmail.com",
        "sly123")
    std1.login()
    std2.register()

    var t1 = Teacher("Pedro", "pedro@gmail.com",
        "killasenali")

    var ht1 = Headteacher("Edwards", "edward@gmail.com",
        "silentkiller")

    ht1.register()
    ht1.login()
    ht1.suspendStudent()
    ht1.approveFunds()

}

open class Student(open var name:String,
                   open var email:String, open var password:String){
    fun register(){
        println("You registered with email $email and password $password")
    }
    fun login(){
        println("You logged in with email $email and password $password")
    }
}
open class Teacher(name:String, email:String, password:String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend student")
    }
}
class Headteacher(name: String, email: String, password: String):Teacher(name, email, password){
    fun approveFunds(){
        println("Yeah, I can approve funds")
    }
}