package invoiceWithKotlin

import java.math.BigDecimal

data class Invoice constructor(
    val title: String,
    val amount: BigDecimal,
    val discount: BigDecimal? = null,
    val extraCharge: BigDecimal? = null,
    val positions: List<Position>,
    val comment: String? = null
)

data class Position(
    val amount: BigDecimal,
    val product: String,
    val quantity: Int
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