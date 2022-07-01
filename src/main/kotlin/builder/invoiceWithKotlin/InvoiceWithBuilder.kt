package builder.invoiceWithKotlin

import prototype.invoiceWithKotlin.Invoice
import prototype.invoiceWithKotlin.Position
import java.math.BigDecimal

data class Invoice(
    private val title: String,
    private val amount: BigDecimal,
    private val discount: BigDecimal? = null,
    private val extraCharge: BigDecimal? = null,
    private val positions: List<Position>,
    private val comment: String? = null
)

data class Position(
    private val amount: BigDecimal,
    private val product: String,
    private val quantity: Int
)


val invoice = Invoice(
    title = "Invoice 0001",
    amount = BigDecimal(123.0),
    extraCharge = BigDecimal(20.0),
    positions =
    listOf(
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
    )
)