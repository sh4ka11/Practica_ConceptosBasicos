// Punto 1
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary(numberOfMessages: Int) {
if (numberOfMessages <100 ){

    println("you have a $numberOfMessages Notifications")
}
    else {
        println("your phone is blowing up! you have a 99+ notifications")

}
}