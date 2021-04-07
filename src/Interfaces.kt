fun main() {
var kendi=Kendi()
    kendi.hobby("hiking","travelling","cooking","counselling")
    kendi.traits("introvert","stable introvert")
    var tiff=Tiff()
    tiff.play(2)
    tiff.color("pink")
    tiff.eat()
    kendi.eyes()
}
open class Human(){
    fun eyes(){
        println("We all have eyes that we use to see")
    }
    fun eat(){
        println("Every person has their favorite food")
    }
}
class Kendi:Human(){
    fun hobby(Like:String,like2:String,like3:String,love:String){
        println("My hobbies are $Like,$like2,and $like3.I have not identified my talent yet but i love $love. ")
    }
    fun traits(trait:String,trait2:String){
        println("I am an $trait but sometimes i love socialising.I think i am an $trait2.")
    }
}
class Tiff:Human(){
    fun play(age:Int){
        println("I am $age and i love playing with my toys ")
    }
    fun color(colour:String){
        println("My mommy loves to buy me $colour clothes and they are really pretty.")
    }
}