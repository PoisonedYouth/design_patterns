package factory.vehicleWithKotlin


abstract class Vehicle(
    val name: String,
    val amountOfWheels: Int,
    val colour: String
) {
    companion object{
        fun createFrom(type: String): Vehicle = when (type) {
            "Car" -> {
                Car("Honda", 4, "red", 4)
            }
            "Bike" -> {
                Bike("Canondale", 2, "blue", "ebike")
            }
            else -> {
                throw IllegalArgumentException("Unknown type!")
            }
        }
    }
}

class Car(
    name: String,
    amountOfWheels: Int,
    colour: String,
    val passengers: Int
) : Vehicle(name, amountOfWheels, colour)

class Bike(
    name: String,
    amountOfWheels: Int,
    colour: String,
    val type: String
) : Vehicle(name, amountOfWheels, colour)


fun main() {
    val input = "Car,Bike"

    input.split(",").forEach {
        println(Vehicle.createFrom(it))
    }
}