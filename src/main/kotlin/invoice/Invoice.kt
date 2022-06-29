package invoice

import java.math.BigDecimal

class Invoice (
    val title: String,
    val amount: BigDecimal,
    val discount: BigDecimal?,
    val extraCharge: BigDecimal?,
    val positions: List<Position>,
    val comment: String?
)

class Position(
    val amount: BigDecimal,
    val product: String,
    val quantity: Int
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