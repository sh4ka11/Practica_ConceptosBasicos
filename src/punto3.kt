fun main() {

    val celsius=27.0
    val kelvin = 350.0
    val Fahrenheit =10.0
printFinalTemperature(celsius, "celsius", "Fahrenheit",::celsiusAfarenheit)
printFinalTemperature(kelvin, "Kelvin", "celsius",::kelvinAcelsius)
printFinalTemperature(Fahrenheit, "Fahrenheit", "Kelvin",::farenheitAkelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
            println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
fun celsiusAfarenheit (celsius : Double): Double {
    return celsius * (9.5)+32
}
fun kelvinAcelsius (kelvin : Double): Double {
    return kelvin - 273.15
}
fun farenheitAkelvin (Fahrenheit: Double): Double {

    return  (Fahrenheit - 32) * 5/9 + 273.15
}