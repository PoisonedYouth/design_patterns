package factory.vehicleWithFactory


interface Vehicle {
    val name: String
    val amountOfWheels: Int
    val colour: String
}

class Car(
    override val name: String,
    override val amountOfWheels: Int,
    override val colour: String,
    val passengers: Int
) : Vehicle

class Bike(
    override val name: String,
    override val amountOfWheels: Int,
    override val colour: String,
    val type: String
) : Vehicle

object VehicleFactory {
    fun createVehicle(type: String): Vehicle = if (type == "Car") {
        Car("Honda", 4, "red", 4)
    }
    else if (type == "Bike") {
        Bike("Canondale", 2, "blue", "ebike")
    }
    else {
        throw IllegalArgumentException("Unknown type!")
    }
}


fun main() {
    val input = "Car,Bike"

    input.split(",").forEach {
        println(VehicleFactory.createVehicle(it))
    }
}
