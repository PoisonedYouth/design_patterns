package builder.invoice

import java.math.BigDecimal

class Invoice (
    private val title: String,
    private val amount: BigDecimal,
    private val discount: BigDecimal?,
    private val extraCharge: BigDecimal?,
    private val positions: List<Position>,
    private val comment: String?
)

class Position(
    private val amount: BigDecimal,
    private val product: String,
    private val quantity: Int
)


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
    null
)