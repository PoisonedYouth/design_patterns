package factory.vehicle

class Car(
    val name: String,
    val amountOfWheels: Int,
    val colour: String,
    val passengers: Int
)

class Bike(
    val name: String,
    val amountOfWheels: Int,
    val colour: String,
    val type: String
)


fun main() {
    val input = "Car,Bike"

    input.split(",").forEach {
        when (it) {
            "Car" -> {
                println(Car("Honda", 4, "red", 4))
            }
            "Bike" -> {
                println(Bike("Canondale", 2, "blue", "ebike"))
            }
            else -> {
                println("Unknown type!")
            }
        }
    }

}
