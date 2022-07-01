package prototype.invoiceWithPrototype

import java.math.BigDecimal

class Invoice(
    val title: String,
    val amount: BigDecimal,
    val discount: BigDecimal?,
    val extraCharge: BigDecimal?,
    val positions: List<Position>,
    val comment: String?,
    private val invoiceNumber: String
) {
    fun copy() = Invoice(
        title,
        amount,
        discount,
        extraCharge,
        positions,
        comment,
        invoiceNumber
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Invoice

        if (title != other.title) return false
        if (amount != other.amount) return false
        if (discount != other.discount) return false
        if (extraCharge != other.extraCharge) return false
        if (positions != other.positions) return false
        if (comment != other.comment) return false
        if (invoiceNumber != other.invoiceNumber) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + amount.hashCode()
        result = 31 * result + (discount?.hashCode() ?: 0)
        result = 31 * result + (extraCharge?.hashCode() ?: 0)
        result = 31 * result + positions.hashCode()
        result = 31 * result + (comment?.hashCode() ?: 0)
        result = 31 * result + invoiceNumber.hashCode()
        return result
    }


}

class Position(
    val amount: BigDecimal,
    val product: String,
    val quantity: Int
)

fun main() {
    val invoice = Invoice(
        "Invoice 0001",
        BigDecimal(123.0),
        null,
        BigDecimal(20.0),
        positions = listOf(
            Position(
                amount = BigDecimal(100.0),
                product = "Product A",
                quantity = 1
            ),
            Position(
                amount = BigDecimal(23.0),
                product = "Product B",
                quantity = 1
            )
        ),
        null,
        "123A"
    )

    val invoice2 = invoice.copy()

    println(invoice == invoice2) // true
}