
open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "encendida" else "apagada"
        println("La luz de la pantalla del teléfono está $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = false) : Phone(isScreenLightOn) {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
            println("El teléfono está encendido")
        } else {
            println("No se puede encender la pantalla mientras el teléfono está plegado.")
        }
    }

    fun fold() {
        isFolded = true
        println("El teléfono está plegado")
    }

    fun unFold() {
        isFolded = false
        println("El teléfono está desplegado")
    }

    fun estadoTelefono() {
        val estado = if (isFolded) "plegado" else "desplegado"
        println("El teléfono está $estado")
    }
}

fun main() {
    val telefonoPlegable = FoldablePhone()

    // Intentar encender el teléfono desplegado
    telefonoPlegable.switchOn()
    telefonoPlegable.checkPhoneScreenLight()

    // Plegar el teléfono
    telefonoPlegable.fold()
    telefonoPlegable.estadoTelefono()

    // Intentar encender el teléfono plegado
    telefonoPlegable.switchOn()
    telefonoPlegable.checkPhoneScreenLight()

    // Desplegar el teléfono
    telefonoPlegable.unFold()
    telefonoPlegable.estadoTelefono()

    // Encender el teléfono desplegado
    telefonoPlegable.switchOn()
    telefonoPlegable.checkPhoneScreenLight()

    // Apagar el teléfono
    telefonoPlegable.switchOff()
    telefonoPlegable.checkPhoneScreenLight()
}




