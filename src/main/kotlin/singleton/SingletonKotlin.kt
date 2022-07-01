package singleton

object SingletonKotlin {
    private var counter: Int = 0

    fun getNextInt(): Int{
        return counter++
    }
}