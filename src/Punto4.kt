fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Nombre: $name")
        println("Edad: $age")
        println("hobby $hobby")
        if(referrer==null) {
            println("doeesn´t have a referer\n")
        }
        else{
         println(referrer
         )
         println("Has a referrer named Amanda, who likes to play tennis.")
        }

    }
}